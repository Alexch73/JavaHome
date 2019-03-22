package KR;

import java.util.ArrayList;
import java.util.Scanner;

public class Opred {
    int a;
    String name, doctor,vis,vr;

    ArrayList<String> Listik = new ArrayList<>();
    ArrayList<String> ListikH = new ArrayList<>();
    ArrayList<String> ListikL = new ArrayList<>();
    ArrayList<String> ListikS = new ArrayList<>();

    void Napolnenie() {
        Listik.add(0, "Главный врач");
        Listik.add(1, "Хирург");
        Listik.add(2, "Лор");
        Listik.add(3, "Стоматолог");
        Listik.add(4, "Пациент");
        ListikH.add(0, "Пациент к Хирургу");
        ListikS.add(0, "Пациент к стоматолгу");
        ListikL.add(0, "Пациент к лору");
    }
        void author () {

            Scanner in = new Scanner(System.in);
            System.out.println("Введите логин");
            switch (in.nextLine()) {
                case "Главный врач":
                    System.out.println("Вы вошли как Главный врач" );
                    System.out.println("Введите необходимое действие");
                    switch (in.next()) {
                        case "лор":
                            for (String n:ListikL)
                                System.out.println(n);
                            break;
                        case "хирург":
                            for (String n:ListikH)
                                System.out.println(n);
                            break;
                        case "стоматолог":
                            for (String n:ListikS)
                                System.out.println(n);

                            break;

                        default:
                            System.out.println("Неверная команда");
                    }
                    break;


                case "Хирург":
                    System.out.println("Вы вошли как  "+ Listik.get(1) );
                    System.out.println( " Введите необходимое действие" );
                    switch (in.next()) {
                        case "список":
                            for (String n : ListikH)
                                System.out.println(n);
                            break;
                        default:
                            System.out.println("Неверная команда");

                    }
                            break;

                case "Лор":
                    System.out.println("Вы вошли как  "+ Listik.get(2) );
                    System.out.println( " Введите необходимое действие" );
                    switch (in.next()) {
                        case "список":
                            for (String n : ListikL)
                                System.out.println(n);
                            break;
                        default:
                            System.out.println("Неверная команда");

                    }
                    break;
                case "Стоматолог":
                    System.out.println("Вы вошли как  "+ Listik.get(3) );
                    System.out.println( " Введите необходимое действие" );
                    switch (in.next()) {
                        case "список":
                            for (String n : ListikS)
                                System.out.println(n);
                            break;
                        default:
                            System.out.println("Неверная команда");

                    }
                    break;
                case "Пациент":
                    System.out.println("Вы вошли как  "+ Listik.get(3) );

                    break;
                default:
                    System.out.println("Пользователь не был зарегестрирован, пройдите регистрацию введите ваше имя");
                    String vis = in.next();
                    System.out.println("Введите необходимого врача");
                    switch (in.next()) {
                        case "Хирург":
                            a=ListikH.size();
                            ListikH.add(a,vis);
                            System.out.println("Вы записались на прием к врачу "+Listik.get(1));


                            break;
                        case "Лор":
                            a=ListikL.size();
                            ListikL.add(a,vis);
                            System.out.println("Вы записались на прием к врачу "+ListikL.get(2));

                            break;
                        case "Стоматолог":
                            a=ListikS.size();
                            ListikS.add(a,vis);
                            System.out.println("Вы записались на прием к врачу "+ListikS.get(3));

                            break;
                        default:
                            System.out.println("некорректно введено имя врача, пожалуйста повторите регистрацию заного");


                    }

                    //String vr = in.next();

                   /* a=Listik2.size();
                    Listik2.add(a,vis);
                    System.out.println("Вы успешно зарегиистрировались");
                    System.out.println(Listik2.get(a));
                    break;*/

            }


        }


    }


