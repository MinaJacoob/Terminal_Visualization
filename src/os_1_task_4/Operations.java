/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package os_1_task_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 *
 * @author root
 */

public class Operations {

    private Process pr;
    private Runtime run;
    private String cmd;
    private BufferedReader buf;
    private String line_return = "";
    private String line = "";

    public Operations() throws InterruptedException, IOException {
        this.run = Runtime.getRuntime();
    }

    public String List(String Full_Path) {
        System.out.println("Executed");
        this.cmd = "ls " + Full_Path;
        System.out.println(cmd);
        try {
            this.pr = run.exec(cmd);
            this.pr.waitFor();
            this.buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            while ((this.line = buf.readLine()) != null) {
                this.line_return += (this.line + "\n");
            }
            return this.line_return;
        } catch (IOException ex) {
            return "Execute Faild";
        } catch (InterruptedException ex) {
            return "Execute Faild";
        }
    }

    public Boolean Change_Permissions(String Full_Path, String Permission_needed) {
        this.cmd = "sudo chmod " +Permission_needed+" "+ Full_Path ;
        try {
            this.pr = run.exec(cmd);
            this.pr.waitFor();
            this.buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            return true;
        } catch (IOException | InterruptedException ex) {
            return false;
        }
    }

    public Boolean Make_dir(String Full_Path, String Dir_Name) {
        this.cmd = "sudo mkdir " +Full_Path+"/"+ Dir_Name ;
        try {
            this.pr = run.exec(cmd);
            this.pr.waitFor();
            this.buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            return true;
        } catch (IOException | InterruptedException ex) {
            return false;
        }
    }
    
    public Boolean Make_files(String Full_Path, String file_Name) {
        this.cmd = "sudo touch " +Full_Path+"/"+ file_Name ;
        try {
            this.pr = run.exec(cmd);
            this.pr.waitFor();
            this.buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            return true;
        } catch (IOException ex) {
            return false;
        } catch (InterruptedException ex) {
            return false;
        }
    }
    
    public Boolean Delete_dir(String Full_Path, String Dir_name) {
        
        this.cmd = "sudo rmdir " +Full_Path+"/"+ Dir_name ;
        try {
            this.pr = run.exec(cmd);
            this.pr.waitFor();
            this.buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            return true;
        } catch (IOException ex) {
            return false;
        } catch (InterruptedException ex) {
            return false;
        }
    }
    
    public Boolean Delete_files(String Full_Path, String file_name){
        
        this.cmd = "sudo rm " +Full_Path+"/"+ file_name ;
        try {
            this.pr = run.exec(cmd);
            this.pr.waitFor();
            this.buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            return true;
        } catch (IOException ex) {
            return false;
        } catch (InterruptedException ex) {
            return false;
        }
    }
    
    public Boolean Create_symbolic_link(String Full_Path, String link_name){
        
        this.cmd = "sudo ln " +Full_Path+" "+ link_name ;
        try {
            this.pr = run.exec(cmd);
            this.pr.waitFor();
            this.buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            return true;
        } catch (IOException ex) {
            return false;
        } catch (InterruptedException ex) {
            return false;
        }        
    }
}
