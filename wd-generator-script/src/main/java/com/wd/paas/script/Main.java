package com.wd.paas.script;

import com.beust.jcommander.JCommander;

/**
 * 脚本main
 *
 * @author ZhuXueLiang
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        CLI cli = new CLI();
        JCommander jCommander = JCommander.newBuilder().addObject(cli).build();
        try {
            jCommander.parse(args);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(ExitStatus.SYSTEM_EXCEPT.getValue());
        }
        cli.run(jCommander);
    }
}
