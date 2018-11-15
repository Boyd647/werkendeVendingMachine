package com.company;

//scanner
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //geld bijhouden
        double G = 6;
        System.out.println(" ____________________________________________\n" +
                "|############################################|\n" +
                "|#|                           |##############|\n" +
                "|#|  =====  ..--''`  |~~``|   |##|````````|##|\n" +
                "|#|  |   |  \\     |  :    |   |##| Exact  |##|\n" +
                "|#|  |___|   /___ |  | ___|   |##| Change |##|\n" +
                "|#|  /=__\\  ./.__\\   |/,__\\   |##| Only   |##|\n" +
                "|#|  \\__//   \\__//    \\__//   |##|________|##|\n" +
                "|#|===========================|##############|\n" +
                "|#|```````````````````````````|##############|\n" +
                "|#| =.._      +++     //////  |##############|\n" +
                "|#| \\/  \\     | |     \\    \\  |#|`````````|##|\n" +
                "|#|  \\___\\    |_|     /___ /  |#| _______ |##|\n" +
                "|#|  / __\\\\  /|_|\\   // __\\   |#| |1|2|3| |##|\n" +
                "|#|  \\__//-  \\|_//   -\\__//   |#| |4|5|6| |##|\n" +
                "|#|===========================|#| |7|8|9| |##|\n" +
                "|#|```````````````````````````|#| ``````` |##|\n" +
                "|#| ..--    ______   .--._.   |#|[=======]|##|\n" +
                "|#| \\   \\   |    |   |    |   |#|  _   _  |##|\n" +
                "|#|  \\___\\  : ___:   | ___|   |#| ||| ( ) |##|\n" +
                "|#|  / __\\  |/ __\\   // __\\   |#| |||  `  |##|\n" +
                "|#|  \\__//   \\__//  /_\\__//   |#|  ~      |##|\n" +
                "|#|===========================|#|_________|##|\n" +
                "|#|```````````````````````````|##############|\n" +
                "|############################################|\n" +
                "|#|||||||||||||||||||||||||||||####```````###|\n" +
                "|#||||||||||||PUSH|||||||||||||####\\|||||/###|\n" +
                "|############################################|\n" +
                "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////////\n" +
                " |________________________________|CR98|___|\n" +
                "\n");
        int run = 0;
        boolean repeater = false;

        while (run == 0) {

            repeater = false;
            String antwoord;
            String lc;
            String[] antwoordenArray;
            String[] menu;
            menu = new String[10];
            antwoordenArray = new String[6];
            menu[0] = "Koude drankjes:";
            menu[1] = "Cola";
            menu[2] = "Pepsi";
            menu[3] = "Fanta";
            menu[4] = "Water";
            menu[5] = "Warme drankjes:";
            menu[6] = "Koffie";
            menu[7] = "Water";
            menu[8] = "Chocolademelk";
            menu[9] = "Thee";
            boolean repeat = false;
            Scanner s = new Scanner(System.in);
            String lc2;
            String antwoord1;

            boolean vraag = true;

            while (vraag) {
                System.out.println("Heb je dorst? Typ 'exit' om te stoppen, 'menu' om het hele menu te zien, 'geld' om je geld te zien");
                antwoord = s.nextLine();
                lc2 = antwoord.toLowerCase();

                if (lc2.equals("ja")) {
                    System.out.println("Warm of koud");
                    antwoordenArray[0] = "ja";
                    repeater = true;
                    vraag = false;
                } else if (lc2.equals("nee")) {
                    System.out.println("Nu sluit het programma af");
                    System.exit(1);
                    antwoordenArray[0] = "nee";
                    vraag = false;
                } else if (lc2.equals("exit")) {
                    System.exit(1);
                    antwoordenArray[0] = "exit";
                    vraag = false;
                } else if (lc2.equals("geld")) {
                    System.out.println("Je hebt nog €" + G);
                    antwoordenArray[1] = "geld";
                } else if (lc2.equals("menu")){
                    System.out.println(menu[0] +"\n" + menu[1] + "\n" + menu[2] + "\n" + menu[3] + "\n" + menu[4] + "\n" + menu[5] + "\n" + menu[6] +
                            "\n" + menu[7] + "\n" + menu[8] + "\n" + menu[9]);
                    antwoordenArray[5] = "menu";
                }
            }


            boolean vraaag = true;

            antwoord1 = s.nextLine();
            lc = antwoord1.toLowerCase();

            if (lc.equals("koud")) {
                System.out.println("(typ het nummer in niet het woord) Kies uit:\n" +
                        "1. Cola €2\n" +
                        "2. Pepsi €2\n" +
                        "3. Fanta €1\n" +
                        "4. Water €0.50");
                antwoordenArray[2] = "koud";
                repeater = true;

                int cpfw = s.nextInt();

                if (cpfw == 1) {
                    System.out.println("Dat word dan €2");
                    G = G - 2;
                    antwoordenArray[3] = "Cola";
                    System.out.println(" z$$$$$. $$\n" +
                            "    $$$$$$$$$$$\n" +
                            "   $$$$$$**$$$$             eeeeer\n" +
                            "  $$$$$%   '$$$             $$$$$F\n" +
                            " 4$$$$P     *$$             *$$$$F\n" +
                            " $$$$$      '$$    .ee.      ^$$$F            ..e.\n" +
                            " $$$$$       \"\"  .$$$$$$b     $$$F 4$$$$$$   $$$$$$c\n" +
                            "4$$$$F          4$$$\"\"$$$$    $$$F '*$$$$*  $$$P\"$$$L\n" +
                            "4$$$F         .$$$F  ^$$$b   $$$F  J$$$   $$$$  ^$$$.\n" +
                            "4$$$$F         d$$$    $$$$   $$$F J$$P   .$$$F   $$$$\n" +
                            "4$$$$F         $$$$    3$$$F  $$$FJ$$P    4$$$\"   $$$$\n" +
                            "4$$$$F        4$$$$    4$$$$  $$$$$$$r    $$$$$$$$$$$$\n" +
                            "4$$$$$        4$$$$    4$$$$  $$$$$$$$    $$$$********\n" +
                            " $$$$$        4$$$$    4$$$F  $$$F4$$$b   *$$$r\n" +
                            " 3$$$$F       d$$$$    $$$$\"  $$$F *$$$F  4$$$L     .\n" +
                            "  $$$$$.     d$$$$$.   $$$$   $$$F  $$$$.  $$$$    z$P\n" +
                            "   $$$$$e..d$$$\"$$$b  4$$$\"  J$$$L  '$$$$  '$$$b..d$$\n" +
                            "    *$$$$$$$$$  ^$$$be$$$\"  $$$$$$$  3$$$$F \"$$$$$$$\"\n" +
                            "     ^*$$$$P\"     *$$$$*    $$$$$$$   $$$$F  ^*$$$\"");
                    if (G < 0) {
                        System.out.println("Je hebt niet genoeg geld");
                        G = G + 2;
                        vraaag = false;
                    }
                    vraaag = false;
                } else if (cpfw == 2) {
                    System.out.println("Dat word dan €2");
                    G = G - 2;
                    antwoordenArray[3] = "Pepsi";
                    System.out.println("Je hebt nog €" + G);
                    System.out.println("  ..--------------------..\n" +
                            "            |``--------------------''|\n" +
                            "            |                        |\n" +
                            "            |      ,,,;;;;;;,,,      |\n" +
                            "            |   ,;;;;;;;;;;;;;;;;,   |\n" +
                            "            |  ;;;;;;;;;;;;;;;;;;;;  |\n" +
                            "            | ;;;;;;;;;'''  _  '';;; |\n" +
                            "            |   _'''_  _   (_'  |  ` |\n" +
                            "            |  |_) |_  |_) ._)  |    |\n" +
                            "            | .|   |_  |     .....   |\n" +
                            "            | :::..     ...::::::::: |\n" +
                            "            |  ::::::::::::::::::::  |\n" +
                            "            |   '::::::::::::::::'   |\n" +
                            "            |      '''::::::'''      |\n" +
                            "            |                        |\n" +
                            "            |                        |\n" +
                            "            ';----..............----;'\n" +
                            "              '--------------------'");
                    if (G < 0) {
                        System.out.println("Je hebt niet genoeg geld");
                        G = G + 2;
                        System.out.println("Je hebt nog €" + G);
                        vraaag = false;
                    }
                    vraaag = false;
                } else if (cpfw == 3) {
                    System.out.println("Dat word dan €1");
                    antwoordenArray[3] = "Fanta";
                    G = G - 1;
                    System.out.println("Je hebt nog €" + G);
                    System.out.println("───────────────────────────────────\n" +
                            "─────────█████████████████─────────\n" +
                            "──────████░░░░░░░░░░░░░░░████──────\n" +
                            "────███░░░░░░░░░░░░░░░░░░░░░███────\n" +
                            "───██░░░░░░░░░░░░░░░░░░░░░░░░░██───\n" +
                            "──██░░░░░░░░▄███▄░░░░░░░░░░░░░░██──\n" +
                            "─██░░░░░░░▄███████▄░░░░░▄▄░░░░░░██─\n" +
                            "██░░░░░▄▄███████████░░░▄██▄░░░░░░██\n" +
                            "█░░░░░░░▀████████▀░░░██████░███▄░░█\n" +
                            "█░░░▄██▄░░▀▀▀░░░░░░░░░▀███░░░███▄░█\n" +
                            "█░▄█████░░░░░▀██▄█████░░██░▄█████▌█\n" +
                            "█░███▀▀░▄██▄░░░██▀░░▀██░██░██░▀██▌█\n" +
                            "█▐███░░░▀████▄░██░░░░██░██░██░░██▌█\n" +
                            "█▐███▄░░░░████░██░░░░██░██░▀██▄▐█░█\n" +
                            "█▐█████░▄█████░██▌░░▐██░██░░░░░░░░█\n" +
                            "█▐███▀░▄██▀███░██▌░▄███░█░░░░░░░░░█\n" +
                            "█░███░░██░░▀██░███░▀██▀░░░░░░░░░░░█\n" +
                            "█░░██░░███▄░▀█░██▀░░░░░░░░░░░░░░░░█\n" +
                            "██░██░░▀████░▀░░░░░░░░░░░░░░░░░░░██\n" +
                            "─██░▀░░░░▀▀░░░░░░░░░░░░░░░░░░░░░██─\n" +
                            "──██░░░░░░░░░░░░░░░░░░░░░░░░░░░██──\n" +
                            "───██░░░░░░░░░░░░░░░░░░░░░░░░░██───\n" +
                            "────██░░░░░░░░░░░░░░░░░░░░░░░██────\n" +
                            "─────███░░░░░░░░░░░░░░░░░░░███─────\n" +
                            "───────████░░░░░░░░░░░░░████───────\n" +
                            "──────────███████████████──────────\n" +
                            "───────────────────────────────────");
                    if (G < 0) {
                        System.out.println("Je hebt niet genoeg geld");
                        G = G + 1;
                        System.out.println("Je hebt nog €" + G);
                        vraaag = false;
                    }
                    vraaag = false;
                } else if (cpfw == 4) {
                    System.out.println("Dat word dan €0.50");
                    G = G - 0.5;
                    antwoordenArray[3] = "Water";
                    System.out.println("Je hebt nog €" + G);
                    System.out.println("              | |           \n" +
                            "__      ____ _| |_ ___ _ __ \n" +
                            "\\ \\ /\\ / / _` | __/ _ \\ '__|\n" +
                            " \\ V  V / (_| | ||  __/ |   \n" +
                            "  \\_/\\_/ \\__,_|\\__\\___|_|   \n" +
                            "                            ja");
                    if (G < 0) {
                        System.out.println("Je hebt niet genoeg geld");
                        G = G + 0.5;
                        System.out.println("Je hebt nog €" + G);
                        vraaag = false;
                    }
                    vraaag = false;
                }
            }


            if (lc.equals("warm")) {
                System.out.println("(jtyp het nummer in niet het woord) Kies uit:\n" +
                        "1. Koffie €2\n" +
                        "2. Water €1\n" +
                        "3. Chocolademelk €2\n" +
                        "4. Thee €1\n");
                System.out.println("Ik wil nummer: ");
                int kwct = s.nextInt();
                antwoordenArray[2] = "warm";
                repeater = true;

                if (kwct == 1) {
                    System.out.println("Dat word dan €2");
                    G = G - 2;
                    antwoordenArray[3] = "Koffie";
                    System.out.println("Je hebt nog €" + G);
                    System.out.println("         {\n" +
                            "      {   }\n" +
                            "       }_{ __{\n" +
                            "    .-{   }   }-.\n" +
                            "   (   }     {   )\n" +
                            "   |`-.._____..-'|\n" +
                            "   |             ;--.\n" +
                            "   |            (__  \\\n" +
                            "   |             | )  )\n" +
                            "   |             |/  /\n" +
                            "   |             /  / \n" +
                            "   |            (  /\n" +
                            "   \\             y'\n" +
                            "    `-.._____..-'");
                    if (G < 0) {
                        System.out.println("Je hebt niet genoeg geld");
                        G = G + 2;
                        System.out.println("Je hebt nog €" + G);

                    }
                } else if (kwct == 2) {
                    System.out.println("Dat word dan €1");
                    G = G - 1;
                    antwoordenArray[3] = "Water";
                    System.out.println("Je hebt nog €" + G);
                    System.out.println(" mmm\n" +
                            " )-(\n" +
                            "(   )\n" +
                            "|   |\n" +
                            "|   |\n" +
                            "|___|");
                    if (G < 0) {
                        System.out.println("Je hebt niet genoeg geld");
                        G = G + 1;
                        System.out.println("Je hebt nog €" + G);
                    }
                } else if (kwct == 3) {
                    System.out.println("Dat word dan €2");
                    G = G - 2;
                    antwoordenArray[3] = "Chocolademelk";
                    System.out.println("Je hebt nog €" + G);
                    System.out.println(" ( ) ;\n" +
                            " ;)( ;\n" +
                            ":----:\n" +
                            "C|====|\n" +
                            "|    |\n" +
                            "`----'");
                    if (G < 0) {
                        System.out.println("Je hebt niet genoeg geld");
                        G = G + 2;
                        System.out.println("Je hebt nog €" + G);
                    }
                } else if (kwct == 4) {
                    System.out.println("Dat word dan €1");
                    G = G - 1;
                    antwoordenArray[3] = "thee";
                    System.out.println("Je hebt nog €" + G);
                    System.out.println("(  )   (   )  )\n" +
                            "     ) (   )  (  (\n" +
                            "     ( )  (    ) )\n" +
                            "     _____________\n" +
                            "    <_____________> ___\n" +
                            "    |             |/ _ \\\n" +
                            "    |               | | |\n" +
                            "    |               |_| |\n" +
                            " ___|             |\\___/\n" +
                            "/    \\___________/    \\\n" +
                            "\\_____________________/");
                    if (G < 0) {
                        System.out.println("Je hebt niet genoeg geld");
                        G = G + 1;
                        System.out.println("Je hebt nog €" + G);
                    }
                }
            }

            if (antwoordenArray[1] == "geld") {
                System.out.println("Antwoorden die jij hebt gegeven: " + antwoordenArray[0] + " " + antwoordenArray[3] + " " + antwoordenArray[2] + " " + antwoordenArray[1]);
            } else if (antwoordenArray[1] == "" && antwoordenArray[5] == ""){
                System.out.println("Antwoorden die jij hebt gegeven: " + antwoordenArray[0] + " " + antwoordenArray[3] + " " + antwoordenArray[2]);
            } else if (antwoordenArray[1] == "" && antwoordenArray[5] == "menu"){
                System.out.println("Antwoorden die jij hebt gegeven: " + antwoordenArray[0] + " " + antwoordenArray[3] + " " + antwoordenArray[2] + " " + antwoordenArray[5]);
            }

        }
        if (repeater){
            run = 0;
        }
        //dit is geen code dit is ervoor zodat ik de commit knop kan gebruiken
        //fgasgffdsghfgfs
        //gdfsgfdgfdgdfgd
        //gdfgfdgdfgfdgdfgfd
        //yeetyeetyeet
        //commit
        //comit

    }
}



