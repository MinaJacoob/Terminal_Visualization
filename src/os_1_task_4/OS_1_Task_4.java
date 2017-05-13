/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package os_1_task_4;

import java.io.IOException;

/**
 *
 * @author root
 */
public class OS_1_Task_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, IOException {
 
        // TODO code application logic here
        if (args.length == 0){
        Full_GUI fullGUI = new Full_GUI();
        } else if (args[0].equals("--help") || args[0].equals("-help") || args[0].equals("help") || args[0].equals("--h") || args[0].equals("-h")){
            System.out.println("This is the help argument, please refer to the man page by running this command\n\"man os_task\"");
        }

    }

}
