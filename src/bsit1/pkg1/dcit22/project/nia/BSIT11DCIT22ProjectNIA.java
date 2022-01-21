package bsit1.pkg1.dcit22.project.nia;
import java.util.Scanner;
public class BSIT11DCIT22ProjectNIA {
    public static void main(String[] args) {
        //Main variables
        Scanner main_scan=new Scanner(System.in);
        String prompt_main="M", prompt_sub="";
        //End of Main variables
        
        //Main Loop
        do{
            int err_catch=0, err_catch2=0;
            //Declaration of sub menu list headings
            String[] sub_menu_headers2={" [A] PROGRAMS THAT OUTPUT BASIC TEXT "," [B] PROGRAMS THAT USE BASIC ARITHMETIC OPERATORS ",
                " [C] PROGRAMS THAT ARE ABOUT MATHEMATICAL PROBLEMS ", " [D] PROGRAMS THAT USE CONDITIONAL STATEMENTS ",
                " [E] PROGRAMS THAT USE LOOPING STATEMENTS "};
            //End of Declaration of sub menu list headings
            
            //Declaration of sub menu list arrays
            String[] a_list={"Display \"Hello World!\" Program"};
            String[] b_list={"Add numbers Program", "Subtract numbers Program",
                "Multiply numbers Program", "Divide numbers Program", "Get the remainder of numbers Program"};
            String[] c_list={"Compute the salary based on rate and hours Program", "Compute the change based on cash on hand and amount due Program",
                "Compute the amount of tax based on a price Program", "Compute the average of numbers Program",
                "Compute the circumference of a circle Program", "Compute the area of rectangle Program",
                "Compute the area of a circle Program", "Compute the volume of a sphere Program",
                "Compute the celsius conversion of a fahrenheit degree Program", "Compute the fahrenheit conversion of a celsius degree Program",
                "Compute the USD($) conversion of a PHP(₱) Program", "Compute the PHP(₱) conversion of a USD($) Program",
                "Compute the pound conversion of a kilogram Program", "Compute the kilogram conversion of a pound Program"};
            String[] d_list={"Determine if a number is greater than another number Program", "Determine if a number is odd or even Program",
                "Determine the BMI and its corresponding description Program", "Determine the description for a grade Program",
                "Determine the chinese zodiac of a year Program", "Determine if a number is divisible by five or two Program"};
            String[] e_list={"List the multiplication table of a given number Program", "List consecutive numbers then its overall sum Program",
                "Display \"Hello World!\" a specific number of times Program", "Display an arrow pointing on right Program"};
            //End of Declaration of sub menu list arrays
            
            //Declaration of menu list array
            String[] menu_list=new String[(a_list.length)+(b_list.length)+(c_list.length)+(d_list.length)+(e_list.length)];
            //Declaration of menu list array
            
            //Storing sub lists to menu list
            for (int q=1, w=0, e=0; q<=menu_list.length; q++){
                
                //A
                if(w==0){
                    e=0;
                    menu_list[w]=a_list[e];
                    w++;
                }
                //End of A list
                
                //B
                else if(w>=1&&w<=5){
                    if(w==1){
                        e=0;
                        menu_list[w]=b_list[e];
                        w++; e++;
                    }
                    else{
                        menu_list[w]=b_list[e];
                        w++; e++;
                    }  
                }
                //End of B list
                
                //C
                else if(w>=6&&w<=19){
                    if(w==6){
                        e=0;
                        menu_list[w]=c_list[e];
                        w++; e++;
                    }
                    else{
                        menu_list[w]=c_list[e];
                        w++; e++;
                    }  
                }
                //End of C list
                
                //D
                else if(w>=20&&w<=25){
                    if(w==20){
                        e=0;
                        menu_list[w]=d_list[e];
                        w++; e++;
                    }
                    else{
                        menu_list[w]=d_list[e];
                        w++; e++;
                    }  
                }
                //End of D list
                
                //E
                else if(w>=26&&w<=29){
                    if(w==26){
                        e=0;
                        menu_list[w]=e_list[e];
                        w++; e++;
                    }
                    else{
                        menu_list[w]=e_list[e];
                        w++; e++;
                    }  
                }
                //End of E list
                
            }
            //End of Storing sub lists to menu list
/*
----------------------------------------MAIN MENU----------------------------------------
*/
            //Modifiebal variables for borders and gaps
            int max_count=106,
                    ver_border_width=3,
                    hor_border_height=1,
                    ver_gap=3,
                    hor_gap=2,
                    max_line2=0;
            //End of Modifiebal variables for borders and gaps
            //Max lines based on code entered
            if(prompt_main.equals("M") || prompt_main.equals("m")){
                max_line2+=9; err_catch2=1;
            }
            else if(prompt_main.equals("EA") || prompt_main.equals("Ea") || prompt_main.equals("eA") || prompt_main.equals("ea")){
                max_line2+=39;
            }
            else if(prompt_main.equals("A") || prompt_main.equals("a")){
                max_line2+=10;
            }
            else if(prompt_main.equals("B") || prompt_main.equals("b")){           
                max_line2+=14;
            }
            else if(prompt_main.equals("C") || prompt_main.equals("c")){                
                max_line2+=22;
            }
            else if(prompt_main.equals("D") || prompt_main.equals("d")){
                max_line2+=15;                
            }
            else if(prompt_main.equals("E") || prompt_main.equals("e")){
                max_line2+=13;
            }
            else if(prompt_main.equals("?")){
                err_catch=1; max_line2+=15;
            }
            //End of Max lines based on code entered
            int max_line=max_line2+(hor_border_height*2)+(hor_gap*2); //This is the total number of lines to be consumed by the characters
            //End of Modifieable variables for borders and gaps
            
            //Variables to be used in coding
            int char_count=0,
                    b_width_t_b=hor_border_height*max_count,
                    b_width_l=ver_border_width,
                    b_width_r=(max_count-ver_border_width)+1,
                    gap_t_b=hor_gap*max_count,
                    gap_t_b2=0,
                    gap_l=ver_gap+ver_border_width,
                    gap_r=(max_count-(ver_border_width+ver_gap))+1,
                    char_count2=0;
            //End of Variables to be used in coding
 
            //Main menu header
            for(int q=1; q<=max_count; q++){
                String w="|| MAIN MENU ||", w1="|| EXPANDED CATEGORIES ||", w2="|| CATEGORY A EXPANDED ||",w3="|| CATEGORY B EXPANDED ||",w4="|| CATEGORY C EXPANDED ||",w5="|| CATEGORY D EXPANDED ||",w6="|| CATEGORY E EXPANDED ||",w7="|| ABOUT THE PROGRAM ||",w8="|| CATEGORIES COLLAPSED ||";
                char e='=';
                if((q==((max_count-w.length())/2)+1) && (prompt_main.equals("M") || prompt_main.equals("m"))){
                    System.out.print(w); q+=w.length()-1;
                }
                /*else if((q==((max_count-w8.length())/2)+1) && (prompt_main.equals("CA") || prompt_main.equals("Ca") || prompt_main.equals("cA") || prompt_main.equals("ca"))){
                    System.out.print(w8); q+=w8.length()-1;
                }*/
                else if((q==((max_count-w1.length())/2)+1) && (prompt_main.equals("EA") || prompt_main.equals("Ea") || prompt_main.equals("eA") || prompt_main.equals("ea"))){
                    System.out.print(w1); q+=w1.length()-1;
                }
                else if((q==((max_count-w2.length())/2)+1) && (prompt_main.equals("A") || prompt_main.equals("a"))){
                    System.out.print(w2); q+=w2.length()-1;
                }
                else if((q==((max_count-w3.length())/2)+1) && (prompt_main.equals("B") || prompt_main.equals("b"))){
                    System.out.print(w3); q+=w3.length()-1;
                }
                else if((q==((max_count-w4.length())/2)+1) && (prompt_main.equals("C") || prompt_main.equals("c"))){
                    System.out.print(w4); q+=w4.length()-1;
                }
                else if((q==((max_count-w5.length())/2)+1) && (prompt_main.equals("D") || prompt_main.equals("d"))){
                    System.out.print(w5); q+=w5.length()-1;
                }
                else if((q==((max_count-w6.length())/2)+1) && (prompt_main.equals("E") || prompt_main.equals("e"))){
                    System.out.print(w6); q+=w6.length()-1;
                }
                else if((q==((max_count-w7.length())/2)+1) && (prompt_main.equals("?"))){
                    System.out.print(w7); q+=w7.length()-1;
                }
                else{
                    if(q%max_count==0){
                        System.out.println(e);
                    }
                    else{
                        System.out.print(e);
                    }
                }
            }
            //End of Main menu header
            
            //Loop
            for(int q=1; q<=(max_line*max_count); q++){
                
                //Modifieable variables for characters to be displayed
                char w='x',
                        e='-',
                        r='|',
                        i=' ',
                        o=':'; //
                //End of Modifieable variables for characters to be displayed
                
                //Top border
                if(q<=b_width_t_b){
                    if(q%max_count==0){
                        System.out.println(w);
                        char_count+=max_count;
                        char_count2+=max_count;
                        gap_t_b+=max_count;
                        gap_t_b2=gap_t_b;
                    }
                    else{
                        System.out.print(w);
                    }
                }
                //End of Top border
                
                //Line(s) for Top gap
                else if((q>b_width_t_b) && (q<=gap_t_b2)){
                    if(q>char_count&&q<=char_count+gap_t_b){
                        if((q>char_count+b_width_l&&q<char_count+b_width_r)){
                            System.out.print(e);
                        }
                        else{
                            if(q%max_count==0){
                                System.out.println(w);
                                char_count+=max_count;
                                char_count2+=max_count;
                                gap_t_b+=max_count;
                            }
                            else{
                                System.out.print(w);
                            }
                        }
                    }   
                }
                //End of Line(s) for Top gap
                
                //Line(s) for customizable display within inner gaps
                
                //Default
                else if(q>gap_t_b2 && q<=((max_line*max_count)-(max_count*(hor_gap+hor_border_height))) && (prompt_main.equals("M") || prompt_main.equals("m") /*|| prompt_main.equals("CA") || prompt_main.equals("CA") || prompt_main.equals("cA") || prompt_main.equals("ca")*/)){
                    if((q>char_count+b_width_l&&q<char_count+b_width_r)){
                        if(((q>char_count2+gap_l) && (q<(char_count2+gap_r)))){
                            String y=sub_menu_headers2[0];
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*2)) && (q<(char_count2+gap_r)+(max_count*2))){
                            String y=sub_menu_headers2[1];
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*4)) && (q<(char_count2+gap_r)+(max_count*4))){
                            String y=sub_menu_headers2[2];
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*6)) && (q<(char_count2+gap_r)+(max_count*6))){
                            String y=sub_menu_headers2[3];
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*8)) && (q<(char_count2+gap_r)+(max_count*8))){
                            String y=sub_menu_headers2[4];
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    else{
                        if(q%max_count==0){
                            System.out.println(w);
                            char_count+=max_count;
                            
                            gap_t_b+=max_count;
                        }
                        else{
                            System.out.print(w);
                        }
                    }
                }
                //End of Default
                
                //Expand all
                else if(q>gap_t_b2 && q<=((max_line*max_count)-(max_count*(hor_gap+hor_border_height))) && (prompt_main.equals("EA") || prompt_main.equals("Ea") || prompt_main.equals("eA") || prompt_main.equals("ea"))){
                    if((q>char_count+b_width_l&&q<char_count+b_width_r)){
                        //A
                        if(((q>char_count2+gap_l) && (q<(char_count2+gap_r)))){
                            String y=sub_menu_headers2[0];
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*1)) && (q<(char_count2+gap_r)+(max_count*1))){
                            String y=("[A1] "+a_list[0]);
                            if(q>(char_count2+gap_l)+(max_count*1) && q<((char_count2+gap_l)+(max_count*1))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        //End of A
                        
                        //B
                        else if(((q>char_count2+gap_l+(max_count*3)) && (q<(char_count2+gap_r)+(max_count*3)))){
                            String y=sub_menu_headers2[1];
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*4)) && (q<(char_count2+gap_r)+(max_count*4))){
                            String y=("[B1] "+b_list[0]);
                            if(q>(char_count2+gap_l)+(max_count*4) && q<((char_count2+gap_l)+(max_count*4))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*5)) && (q<(char_count2+gap_r)+(max_count*5))){
                            String y=("[B2] "+b_list[1]);
                            if(q>(char_count2+gap_l)+(max_count*5) && q<((char_count2+gap_l)+(max_count*5))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*6)) && (q<(char_count2+gap_r)+(max_count*6))){
                            String y=("[B3] "+b_list[2]);
                            if(q>(char_count2+gap_l)+(max_count*6) && q<((char_count2+gap_l)+(max_count*6))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*7)) && (q<(char_count2+gap_r)+(max_count*7))){
                            String y=("[B4] "+b_list[3]);
                            if(q>(char_count2+gap_l)+(max_count*7) && q<((char_count2+gap_l)+(max_count*7))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*8)) && (q<(char_count2+gap_r)+(max_count*8))){
                            String y=("[B5] "+b_list[4]);
                            if(q>(char_count2+gap_l)+(max_count*8) && q<((char_count2+gap_l)+(max_count*8))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        //End of B
                        
                        //C
                        else if(((q>char_count2+gap_l+(max_count*10)) && (q<(char_count2+gap_r)+(max_count*10)))){
                            String y=sub_menu_headers2[2];
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*11)) && (q<(char_count2+gap_r)+(max_count*11))){
                            String y=("[C1] "+c_list[0]);
                            if(q>(char_count2+gap_l)+(max_count*11) && q<((char_count2+gap_l)+(max_count*11))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*12)) && (q<(char_count2+gap_r)+(max_count*12))){
                            String y=("[C2] "+c_list[1]);
                            if(q>(char_count2+gap_l)+(max_count*12) && q<((char_count2+gap_l)+(max_count*12))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*13)) && (q<(char_count2+gap_r)+(max_count*13))){
                            String y=("[C3] "+c_list[2]);
                            if(q>(char_count2+gap_l)+(max_count*13) && q<((char_count2+gap_l)+(max_count*13))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*14)) && (q<(char_count2+gap_r)+(max_count*14))){
                            String y=("[C4] "+c_list[3]);
                            if(q>(char_count2+gap_l)+(max_count*14) && q<((char_count2+gap_l)+(max_count*14))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*15)) && (q<(char_count2+gap_r)+(max_count*15))){
                            String y=("[C5] "+c_list[4]);
                            if(q>(char_count2+gap_l)+(max_count*15) && q<((char_count2+gap_l)+(max_count*15))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*16)) && (q<(char_count2+gap_r)+(max_count*16))){
                            String y=("[C6] "+c_list[5]);
                            if(q>(char_count2+gap_l)+(max_count*16) && q<((char_count2+gap_l)+(max_count*16))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*17)) && (q<(char_count2+gap_r)+(max_count*17))){
                            String y=("[C7] "+c_list[6]);
                            if(q>(char_count2+gap_l)+(max_count*17) && q<((char_count2+gap_l)+(max_count*17))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*18)) && (q<(char_count2+gap_r)+(max_count*18))){
                            String y=("[C8] "+c_list[7]);
                            if(q>(char_count2+gap_l)+(max_count*18) && q<((char_count2+gap_l)+(max_count*18))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*19)) && (q<(char_count2+gap_r)+(max_count*19))){
                            String y=("[C9] "+c_list[8]);
                            if(q>(char_count2+gap_l)+(max_count*19) && q<((char_count2+gap_l)+(max_count*19))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*20)) && (q<(char_count2+gap_r)+(max_count*20))){
                            String y=("[C10] "+c_list[9]);
                            if(q>(char_count2+gap_l)+(max_count*20) && q<((char_count2+gap_l)+(max_count*20))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*21)) && (q<(char_count2+gap_r)+(max_count*21))){
                            String y=("[C11] "+c_list[10]);
                            if(q>(char_count2+gap_l)+(max_count*21) && q<((char_count2+gap_l)+(max_count*21))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*22)) && (q<(char_count2+gap_r)+(max_count*22))){
                            String y=("[C12] "+c_list[11]);
                            if(q>(char_count2+gap_l)+(max_count*22) && q<((char_count2+gap_l)+(max_count*22))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*23)) && (q<(char_count2+gap_r)+(max_count*23))){
                            String y=("[C13] "+c_list[12]);
                            if(q>(char_count2+gap_l)+(max_count*23) && q<((char_count2+gap_l)+(max_count*23))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*24)) && (q<(char_count2+gap_r)+(max_count*24))){
                            String y=("[C14] "+c_list[13]);
                            if(q>(char_count2+gap_l)+(max_count*24) && q<((char_count2+gap_l)+(max_count*24))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        //End of C
                        
                        //D
                        else if(((q>char_count2+gap_l+(max_count*26)) && (q<(char_count2+gap_r)+(max_count*26)))){
                            String y=sub_menu_headers2[3];
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*27)) && (q<(char_count2+gap_r)+(max_count*27))){
                            String y=("[D1] "+d_list[0]);
                            if(q>(char_count2+gap_l)+(max_count*27) && q<((char_count2+gap_l)+(max_count*27))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*28)) && (q<(char_count2+gap_r)+(max_count*28))){
                            String y=("[D2] "+d_list[1]);
                            if(q>(char_count2+gap_l)+(max_count*28) && q<((char_count2+gap_l)+(max_count*28))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*29)) && (q<(char_count2+gap_r)+(max_count*29))){
                            String y=("[D3] "+d_list[2]);
                            if(q>(char_count2+gap_l)+(max_count*29) && q<((char_count2+gap_l)+(max_count*29))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*30)) && (q<(char_count2+gap_r)+(max_count*30))){
                            String y=("[D4] "+d_list[3]);
                            if(q>(char_count2+gap_l)+(max_count*30) && q<((char_count2+gap_l)+(max_count*30))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*31)) && (q<(char_count2+gap_r)+(max_count*31))){
                            String y=("[D5] "+d_list[4]);
                            if(q>(char_count2+gap_l)+(max_count*31) && q<((char_count2+gap_l)+(max_count*31))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*32)) && (q<(char_count2+gap_r)+(max_count*32))){
                            String y=("[D6] "+d_list[5]);
                            if(q>(char_count2+gap_l)+(max_count*32) && q<((char_count2+gap_l)+(max_count*32))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        //End of D
                        
                        //E
                        else if(((q>char_count2+gap_l+(max_count*34)) && (q<(char_count2+gap_r)+(max_count*34)))){
                            String y=sub_menu_headers2[4];
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*35)) && (q<(char_count2+gap_r)+(max_count*35))){
                            String y=("[E1] "+e_list[0]);
                            if(q>(char_count2+gap_l)+(max_count*35) && q<((char_count2+gap_l)+(max_count*35))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*36)) && (q<(char_count2+gap_r)+(max_count*36))){
                            String y=("[E2] "+e_list[1]);
                            if(q>(char_count2+gap_l)+(max_count*36) && q<((char_count2+gap_l)+(max_count*36))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*37)) && (q<(char_count2+gap_r)+(max_count*37))){
                            String y=("[E3] "+e_list[2]);
                            if(q>(char_count2+gap_l)+(max_count*37) && q<((char_count2+gap_l)+(max_count*37))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*38)) && (q<(char_count2+gap_r)+(max_count*38))){
                            String y=("[E4] "+e_list[3]);
                            if(q>(char_count2+gap_l)+(max_count*38) && q<((char_count2+gap_l)+(max_count*38))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        //End of E
                        
                        else{
                            System.out.print(e);
                        }
                    }
                    else{
                        if(q%max_count==0){
                            System.out.println(w);
                            char_count+=max_count;
                            
                            gap_t_b+=max_count;
                        }
                        else{
                            System.out.print(w);
                        }
                    }
                }
                //End of Expand all
                
                //A expand
                else if(q>gap_t_b2 && q<=((max_line*max_count)-(max_count*(hor_gap+hor_border_height))) && (prompt_main.equals("A") || prompt_main.equals("a"))){
                    if((q>char_count+b_width_l&&q<char_count+b_width_r)){
                        if(((q>char_count2+gap_l) && (q<(char_count2+gap_r)))){
                            String y=sub_menu_headers2[0];
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*1)) && (q<(char_count2+gap_r)+(max_count*1))){
                            String y=("[A1] "+a_list[0]);
                            if(q>(char_count2+gap_l)+(max_count*1) && q<((char_count2+gap_l)+(max_count*1))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*3)) && (q<(char_count2+gap_r)+(max_count*3))){
                            String y=sub_menu_headers2[1];
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*5)) && (q<(char_count2+gap_r)+(max_count*5))){
                            String y=sub_menu_headers2[2];
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*7)) && (q<(char_count2+gap_r)+(max_count*7))){
                            String y=sub_menu_headers2[3];
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*9)) && (q<(char_count2+gap_r)+(max_count*9))){
                            String y=sub_menu_headers2[4];
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    else{
                        if(q%max_count==0){
                            System.out.println(w);
                            char_count+=max_count;
                            
                            gap_t_b+=max_count;
                        }
                        else{
                            System.out.print(w);
                        }
                    }
                }
                //End of A expand
                
                //B expand
                else if(q>gap_t_b2 && q<=((max_line*max_count)-(max_count*(hor_gap+hor_border_height))) && (prompt_main.equals("B") || prompt_main.equals("b"))){
                    if((q>char_count+b_width_l&&q<char_count+b_width_r)){
                        if(((q>char_count2+gap_l) && (q<(char_count2+gap_r)))){
                            String y=sub_menu_headers2[0];
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*2)) && (q<(char_count2+gap_r)+(max_count*2))){
                            String y=sub_menu_headers2[1];
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*3)) && (q<(char_count2+gap_r)+(max_count*3))){
                            String y=("[B1] "+b_list[0]);
                            if(q>(char_count2+gap_l)+(max_count*3) && q<((char_count2+gap_l)+(max_count*3))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*4)) && (q<(char_count2+gap_r)+(max_count*4))){
                            String y=("[B2] "+b_list[1]);
                            if(q>(char_count2+gap_l)+(max_count*4) && q<((char_count2+gap_l)+(max_count*4))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*5)) && (q<(char_count2+gap_r)+(max_count*5))){
                            String y=("[B3] "+b_list[2]);
                            if(q>(char_count2+gap_l)+(max_count*5) && q<((char_count2+gap_l)+(max_count*5))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*6)) && (q<(char_count2+gap_r)+(max_count*6))){
                            String y=("[B4] "+b_list[3]);
                            if(q>(char_count2+gap_l)+(max_count*6) && q<((char_count2+gap_l)+(max_count*6))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*7)) && (q<(char_count2+gap_r)+(max_count*7))){
                            String y=("[B5] "+b_list[4]);
                            if(q>(char_count2+gap_l)+(max_count*7) && q<((char_count2+gap_l)+(max_count*7))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*9)) && (q<(char_count2+gap_r)+(max_count*9))){
                            String y=sub_menu_headers2[2];
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*11)) && (q<(char_count2+gap_r)+(max_count*11))){
                            String y=sub_menu_headers2[3];
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*13)) && (q<(char_count2+gap_r)+(max_count*13))){
                            String y=sub_menu_headers2[4];
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    else{
                        if(q%max_count==0){
                            System.out.println(w);
                            char_count+=max_count;
                            
                            gap_t_b+=max_count;
                        }
                        else{
                            System.out.print(w);
                        }
                    }
                }
                //End of B expand
                
                //C expand
                else if(q>gap_t_b2 && q<=((max_line*max_count)-(max_count*(hor_gap+hor_border_height))) && (prompt_main.equals("C") || prompt_main.equals("c"))){
                    if((q>char_count+b_width_l&&q<char_count+b_width_r)){
                        if(((q>char_count2+gap_l) && (q<(char_count2+gap_r)))){
                            String y=sub_menu_headers2[0];
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*2)) && (q<(char_count2+gap_r)+(max_count*2))){
                            String y=sub_menu_headers2[1];
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*4)) && (q<(char_count2+gap_r)+(max_count*4))){
                            String y=sub_menu_headers2[2];
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*5)) && (q<(char_count2+gap_r)+(max_count*5))){
                            String y=("[C1] "+c_list[0]);
                            if(q>(char_count2+gap_l)+(max_count*5) && q<((char_count2+gap_l)+(max_count*5))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*6)) && (q<(char_count2+gap_r)+(max_count*6))){
                            String y=("[C2] "+c_list[1]);
                            if(q>(char_count2+gap_l)+(max_count*6) && q<((char_count2+gap_l)+(max_count*6))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*7)) && (q<(char_count2+gap_r)+(max_count*7))){
                            String y=("[C3] "+c_list[2]);
                            if(q>(char_count2+gap_l)+(max_count*7) && q<((char_count2+gap_l)+(max_count*7))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*7)) && (q<(char_count2+gap_r)+(max_count*7))){
                            String y=("[C4] "+c_list[3]);
                            if(q>(char_count2+gap_l)+(max_count*7) && q<((char_count2+gap_l)+(max_count*7))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*8)) && (q<(char_count2+gap_r)+(max_count*8))){
                            String y=("[C5] "+c_list[4]);
                            if(q>(char_count2+gap_l)+(max_count*8) && q<((char_count2+gap_l)+(max_count*8))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*9)) && (q<(char_count2+gap_r)+(max_count*9))){
                            String y=("[C6] "+c_list[5]);
                            if(q>(char_count2+gap_l)+(max_count*9) && q<((char_count2+gap_l)+(max_count*9))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*10)) && (q<(char_count2+gap_r)+(max_count*10))){
                            String y=("[C7] "+c_list[6]);
                            if(q>(char_count2+gap_l)+(max_count*10) && q<((char_count2+gap_l)+(max_count*10))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*11)) && (q<(char_count2+gap_r)+(max_count*11))){
                            String y=("[C8] "+c_list[7]);
                            if(q>(char_count2+gap_l)+(max_count*11) && q<((char_count2+gap_l)+(max_count*11))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*12)) && (q<(char_count2+gap_r)+(max_count*12))){
                            String y=("[C9] "+c_list[8]);
                            if(q>(char_count2+gap_l)+(max_count*12) && q<((char_count2+gap_l)+(max_count*12))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*13)) && (q<(char_count2+gap_r)+(max_count*13))){
                            String y=("[C10] "+c_list[9]);
                            if(q>(char_count2+gap_l)+(max_count*13) && q<((char_count2+gap_l)+(max_count*13))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*14)) && (q<(char_count2+gap_r)+(max_count*14))){
                            String y=("[C11] "+c_list[10]);
                            if(q>(char_count2+gap_l)+(max_count*14) && q<((char_count2+gap_l)+(max_count*14))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*15)) && (q<(char_count2+gap_r)+(max_count*15))){
                            String y=("[C12] "+c_list[11]);
                            if(q>(char_count2+gap_l)+(max_count*15) && q<((char_count2+gap_l)+(max_count*15))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*16)) && (q<(char_count2+gap_r)+(max_count*16))){
                            String y=("[C13] "+c_list[12]);
                            if(q>(char_count2+gap_l)+(max_count*16) && q<((char_count2+gap_l)+(max_count*16))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*17)) && (q<(char_count2+gap_r)+(max_count*17))){
                            String y=("[C14] "+c_list[13]);
                            if(q>(char_count2+gap_l)+(max_count*17) && q<((char_count2+gap_l)+(max_count*17))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*19)) && (q<(char_count2+gap_r)+(max_count*19))){
                            String y=sub_menu_headers2[3];
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*21)) && (q<(char_count2+gap_r)+(max_count*21))){
                            String y=sub_menu_headers2[4];
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    else{
                        if(q%max_count==0){
                            System.out.println(w);
                            char_count+=max_count;
                            
                            gap_t_b+=max_count;
                        }
                        else{
                            System.out.print(w);
                        }
                    }
                }
                //End of C expand
                
                //D expand
                else if(q>gap_t_b2 && q<=((max_line*max_count)-(max_count*(hor_gap+hor_border_height))) && (prompt_main.equals("D") || prompt_main.equals("d"))){
                    if((q>char_count+b_width_l&&q<char_count+b_width_r)){
                        if(((q>char_count2+gap_l) && (q<(char_count2+gap_r)))){
                            String y=sub_menu_headers2[0];
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*2)) && (q<(char_count2+gap_r)+(max_count*2))){
                            String y=sub_menu_headers2[1];
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*4)) && (q<(char_count2+gap_r)+(max_count*4))){
                            String y=sub_menu_headers2[2];
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*6)) && (q<(char_count2+gap_r)+(max_count*6))){
                            String y=sub_menu_headers2[3];
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*7)) && (q<(char_count2+gap_r)+(max_count*7))){
                            String y=("[D1] "+d_list[0]);
                            if(q>(char_count2+gap_l)+(max_count*7) && q<((char_count2+gap_l)+(max_count*7))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*8)) && (q<(char_count2+gap_r)+(max_count*8))){
                            String y=("[D2] "+d_list[1]);
                            if(q>(char_count2+gap_l)+(max_count*8) && q<((char_count2+gap_l)+(max_count*8))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*9)) && (q<(char_count2+gap_r)+(max_count*9))){
                            String y=("[D3] "+d_list[2]);
                            if(q>(char_count2+gap_l)+(max_count*9) && q<((char_count2+gap_l)+(max_count*9))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*10)) && (q<(char_count2+gap_r)+(max_count*10))){
                            String y=("[D4] "+d_list[3]);
                            if(q>(char_count2+gap_l)+(max_count*10) && q<((char_count2+gap_l)+(max_count*10))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*11)) && (q<(char_count2+gap_r)+(max_count*11))){
                            String y=("[D5] "+d_list[4]);
                            if(q>(char_count2+gap_l)+(max_count*11) && q<((char_count2+gap_l)+(max_count*11))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*12)) && (q<(char_count2+gap_r)+(max_count*12))){
                            String y=("[D6] "+d_list[5]);
                            if(q>(char_count2+gap_l)+(max_count*12) && q<((char_count2+gap_l)+(max_count*12))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*14)) && (q<(char_count2+gap_r)+(max_count*14))){
                            String y=sub_menu_headers2[4];
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    else{
                        if(q%max_count==0){
                            System.out.println(w);
                            char_count+=max_count;
                            
                            gap_t_b+=max_count;
                        }
                        else{
                            System.out.print(w);
                        }
                    }
                }
                //End of D expand
                
                //About the program
                else if(q>gap_t_b2 && q<=((max_line*max_count)-(max_count*(hor_gap+hor_border_height))) && (prompt_main.equals("?"))){
                    if((q>char_count+b_width_l&&q<char_count+b_width_r)){
                        if(((q>char_count2+gap_l) && (q<(char_count2+gap_r)))){
                            String y=("||   \"COMPILATION OF PROGRAMS\"   ||");
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else if(((q>char_count2+gap_l+(max_count*3)) && (q<(char_count2+gap_r)+(max_count*3)))){
                            String y=("»»»   Amolat, Nommel Isanar Lavapie - BSIT1-1   «««");
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else if(((q>char_count2+gap_l+(max_count*4)) && (q<(char_count2+gap_r)+(max_count*4)))){
                            String y=("o   BSIT1-1 - Developer   o");
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if(((q>char_count2+gap_l+(max_count*6)) && (q<(char_count2+gap_r)+(max_count*6)))){
                            String y=("»»»   Mr. Cyril Dave M. Flor   «««");
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else if(((q>char_count2+gap_l+(max_count*7)) && (q<(char_count2+gap_r)+(max_count*7)))){
                            String y=("o   DCIT22 - Instructor/Professor   o");
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if(((q>char_count2+gap_l+(max_count*9)) && (q<(char_count2+gap_r)+(max_count*9)))){
                            String y=(" This program is a compilation of almost all the programs I learned from my Instructor. ");
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if(((q>char_count2+gap_l+(max_count*9)) && (q<(char_count2+gap_r)+(max_count*9)))){
                            String y=(" The program has a total count of "+menu_list.length+" of programs. ");
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if(((q>char_count2+gap_l+(max_count*10)) && (q<(char_count2+gap_r)+(max_count*10)))){
                            String y=(" The program has a total pool of "+menu_list.length+" programs. ");
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if(((q>char_count2+gap_l+(max_count*11)) && (q<(char_count2+gap_r)+(max_count*11)))){
                            String y=(" Most of the programs were based on the samples given and taught by my Instructor. ");
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if(((q>char_count2+gap_l+(max_count*13)) && (q<(char_count2+gap_r)+(max_count*13)))){
                            String y=("»»»   November 25, 2018   «««");
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else if(((q>char_count2+gap_l+(max_count*14)) && (q<(char_count2+gap_r)+(max_count*14)))){
                            String y=("o   Date Successfully Finised   o");
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    else{
                        if(q%max_count==0){
                            System.out.println(w);
                            char_count+=max_count;
                            
                            gap_t_b+=max_count;
                        }
                        else{
                            System.out.print(w);
                        }
                    }
                }
                //End of About the program
                
                //E expand
                else if(q>gap_t_b2 && q<=((max_line*max_count)-(max_count*(hor_gap+hor_border_height))) && (prompt_main.equals("E") || prompt_main.equals("e"))){
                    if((q>char_count+b_width_l&&q<char_count+b_width_r)){
                        if(((q>char_count2+gap_l) && (q<(char_count2+gap_r)))){
                            String y=sub_menu_headers2[0];
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*2)) && (q<(char_count2+gap_r)+(max_count*2))){
                            String y=sub_menu_headers2[1];
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*4)) && (q<(char_count2+gap_r)+(max_count*4))){
                            String y=sub_menu_headers2[2];
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*6)) && (q<(char_count2+gap_r)+(max_count*6))){
                            String y=sub_menu_headers2[3];
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*8)) && (q<(char_count2+gap_r)+(max_count*8))){
                            String y=sub_menu_headers2[4];
                            if(q==((max_count-y.length())/2)+(((char_count)+1))){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(o);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*9)) && (q<(char_count2+gap_r)+(max_count*9))){
                            String y=("[E1] "+e_list[0]);
                            if(q>(char_count2+gap_l)+(max_count*9) && q<((char_count2+gap_l)+(max_count*9))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*10)) && (q<(char_count2+gap_r)+(max_count*10))){
                            String y=("[E2] "+e_list[1]);
                            if(q>(char_count2+gap_l)+(max_count*10) && q<((char_count2+gap_l)+(max_count*10))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*11)) && (q<(char_count2+gap_r)+(max_count*11))){
                            String y=("[E3] "+e_list[2]);
                            if(q>(char_count2+gap_l)+(max_count*11) && q<((char_count2+gap_l)+(max_count*11))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else if((q>(char_count2+gap_l)+(max_count*12)) && (q<(char_count2+gap_r)+(max_count*12))){
                            String y=("[E4] "+e_list[3]);
                            if(q>(char_count2+gap_l)+(max_count*12) && q<((char_count2+gap_l)+(max_count*12))+2){
                                System.out.print(y);
                                q+=y.length()-1;
                            }
                            else{
                                System.out.print(i);
                            }
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    else{
                        if(q%max_count==0){
                            System.out.println(w);
                            char_count+=max_count;
                            
                            gap_t_b+=max_count;
                        }
                        else{
                            System.out.print(w);
                        }
                    }
                }
                //End of E expand
                
                //End of Line(s) for customizable display within inner gaps
                
                //Line(s) for Bottom gap
                else if(q>((max_line*max_count)-(max_count*(hor_gap+hor_border_height))) && q<=((max_line*max_count)-(max_count*hor_border_height))){
                    if(q>char_count&&q<=char_count+gap_t_b){
                        if((q>char_count+b_width_l&&q<char_count+b_width_r)){
                            System.out.print(e);
                        }
                        else{
                            if(q%max_count==0){
                                System.out.println(w);
                                char_count+=max_count;
                                char_count2+=max_count;
                                gap_t_b+=max_count;
                            }
                            else{
                                System.out.print(w);
                            }
                        }
                    }
                }
                //End of Line(s) for Bottom gap
                
                //Bottom border
                else {
                    if(q%max_count==0){
                        System.out.println(w);
                        char_count+=max_count;
                        char_count2+=max_count;
                    }
                    else{
                        System.out.print(w);
                    }
                }
                //End of Bottom border
                
            }
            //End of Loop
            
            //General guidelines header
            System.out.println();
            for(int q=1; q<=max_count; q++){
                String w="| GENERAL GUIDELINES |";
                char e='-';
                if(q==((max_count-w.length())/10)+1){
                    System.out.print(w);
                    q+=w.length()-1;
                }
                else{
                    if(q%max_count==0){
                        System.out.println(e);
                    }
                    else{
                        System.out.print(e);
                    }
                }
            }
            //End of General guidelines header
            
            //
            System.out.print("\t-The program functions through character(s) encapsulated in square brackets, e.g. [X]."
                    + "\n\t-The codes are not case sensitive, as for example, code [X] is the same as [x]."
                    + "\n\t-Just type the code encapsulated, excluding the square brackets themselves,\n\t in the prompt then press Enter."
                    + "\n\t-In the main menu, choose one of the codes listed to expand a specific category of programs."
                    + "\n\t-In addition, here are some of the other codes that serve functions:"
                    + "\n\n\t\t[EA] Expand all the categories listed in the main menu."
                    /*+ "\n\t\t[CA] Collapse all the categories listed in the main menu."*/
                    + "\n\t\t[M] Go to Main Menu."
                    + "\n\t\t[X] Exit the Program."
                    + "\n\t\t[?] Learn more about the program.");
            //
            
            //General guidelines footer
            System.out.println();
            for(int q=1; q<=max_count; q++){
                char e='-';
                if(q%max_count==0){
                    System.out.println(e);
                }
                else{
                    System.out.print(e);
                }
                
            }
            System.out.println();
            //End of General guidelines footer
            
            //Main Prompt
            do{
                char e='.';
                for(int q=1; q<=max_count; q++){
                    if(q%max_count==0){
                        System.out.println(e);
                    }
                    else{
                        System.out.print(e);
                    }
                
                }
                System.out.print("(PROMPT)►►►Enter a code: ");
                prompt_main=main_scan.next();
                if(!(prompt_main.equals("EA") || prompt_main.equals("Ea") || prompt_main.equals("eA") || prompt_main.equals("ea") /*|| prompt_main.equals("CA") || prompt_main.equals("Ca") ||
                        prompt_main.equals("cA") || prompt_main.equals("ca")*/ || prompt_main.equals("C") || prompt_main.equals("c") || prompt_main.equals("M") || prompt_main.equals("m") ||
                        prompt_main.equals("X") || prompt_main.equals("x") || prompt_main.equals("?") || prompt_main.equals("A") || prompt_main.equals("a") || prompt_main.equals("B") ||
                        prompt_main.equals("b") || prompt_main.equals("C") || prompt_main.equals("c") || prompt_main.equals("D") || prompt_main.equals("d") || prompt_main.equals("E") ||
                        prompt_main.equals("e") || prompt_main.equals("A1") || prompt_main.equals("a1") || prompt_main.equals("B1") || prompt_main.equals("b1") || prompt_main.equals("B2") ||
                        prompt_main.equals("b2") || prompt_main.equals("B3") || prompt_main.equals("b3") || prompt_main.equals("B4") || prompt_main.equals("b4") || prompt_main.equals("B5") ||
                        prompt_main.equals("b5") || prompt_main.equals("C1") || prompt_main.equals("c1") || prompt_main.equals("C2") || prompt_main.equals("c2") || prompt_main.equals("C3") || prompt_main.equals("c3") || prompt_main.equals("C4") ||
                        prompt_main.equals("c4") || prompt_main.equals("C5") || prompt_main.equals("c5") || prompt_main.equals("C6") || prompt_main.equals("c6") || prompt_main.equals("C7") ||
                        prompt_main.equals("c7") || prompt_main.equals("C8") || prompt_main.equals("c8") || prompt_main.equals("C9") || prompt_main.equals("c9") || prompt_main.equals("C10") ||
                        prompt_main.equals("c10") || prompt_main.equals("C11") || prompt_main.equals("c11") || prompt_main.equals("C12") || prompt_main.equals("c12") || prompt_main.equals("C13") ||
                        prompt_main.equals("c13") || prompt_main.equals("C14") || prompt_main.equals("c14") || prompt_main.equals("D1") || prompt_main.equals("d1") || prompt_main.equals("D2") ||
                        prompt_main.equals("d2") || prompt_main.equals("D3") || prompt_main.equals("d3") || prompt_main.equals("D4") || prompt_main.equals("d4") || prompt_main.equals("D5") ||
                        prompt_main.equals("d5") || prompt_main.equals("D6") || prompt_main.equals("d6") || prompt_main.equals("E1") || prompt_main.equals("e1") || prompt_main.equals("E2") ||
                        prompt_main.equals("e2") || prompt_main.equals("E3") || prompt_main.equals("e3") || prompt_main.equals("E4") || prompt_main.equals("e4"))){
                    for(int q=1; q<=max_count; q++){
                    if(q%max_count==0){
                        System.out.println(e);
                    }
                    else{
                        System.out.print(e);
                    }
                
                }
                System.out.println("(ERROR)►►►The code you entered is invalid. Make sure that the square brackets are not included.");
                }
                else if(((prompt_main.equals("EA") || prompt_main.equals("Ea") || prompt_main.equals("eA") || prompt_main.equals("ea") /*|| prompt_main.equals("CA") || prompt_main.equals("Ca") ||
                    prompt_main.equals("cA") || prompt_main.equals("ca")*/ || prompt_main.equals("A1") || prompt_main.equals("a1") || prompt_main.equals("B1") || prompt_main.equals("b1") ||
                    prompt_main.equals("B2") || prompt_main.equals("b2") || prompt_main.equals("B3") || prompt_main.equals("b3") || prompt_main.equals("B4") || prompt_main.equals("b4") ||
                    prompt_main.equals("B5") || prompt_main.equals("b5") || prompt_main.equals("C1") || prompt_main.equals("c1") || prompt_main.equals("C3") || prompt_main.equals("c3") ||
                    prompt_main.equals("C4") || prompt_main.equals("c4") || prompt_main.equals("C5") || prompt_main.equals("c5") || prompt_main.equals("C6") || prompt_main.equals("c6") ||
                    prompt_main.equals("C7") || prompt_main.equals("c7") || prompt_main.equals("C8") || prompt_main.equals("c8") || prompt_main.equals("C9") || prompt_main.equals("c9") ||
                    prompt_main.equals("C10") || prompt_main.equals("c10") || prompt_main.equals("C11") || prompt_main.equals("c11") || prompt_main.equals("C12") || prompt_main.equals("c12") ||
                    prompt_main.equals("C13") || prompt_main.equals("c13") || prompt_main.equals("C14") || prompt_main.equals("c14") || prompt_main.equals("D1") || prompt_main.equals("d1") ||
                    prompt_main.equals("D2") || prompt_main.equals("d2") || prompt_main.equals("D3") || prompt_main.equals("d3") || prompt_main.equals("D4") || prompt_main.equals("d4") ||
                    prompt_main.equals("D5") || prompt_main.equals("d5") || prompt_main.equals("D6") || prompt_main.equals("d6") || prompt_main.equals("E1") || prompt_main.equals("e1") ||
                    prompt_main.equals("E2") || prompt_main.equals("e2") || prompt_main.equals("E3") || prompt_main.equals("e3") || prompt_main.equals("E4") || prompt_main.equals("e4") ||
                    prompt_main.equals("A") || prompt_main.equals("a") || prompt_main.equals("B") || prompt_main.equals("b") || prompt_main.equals("C") || prompt_main.equals("c") ||
                    prompt_main.equals("D") || prompt_main.equals("d") || prompt_main.equals("E") || prompt_main.equals("e")) && err_catch==1)){
                    for(int q=1; q<=max_count; q++){
                    if(q%max_count==0){
                        System.out.println(e);
                    }
                    else{
                        System.out.print(e);
                    }
                
                }
                System.out.println("(ERROR)►►►Unable to process. The function is not available at this page. Go back to Main Menu first.");
                }
                else if(((prompt_main.equals("A1") || prompt_main.equals("a1") || prompt_main.equals("B1") || prompt_main.equals("b1") ||
                    prompt_main.equals("B2") || prompt_main.equals("b2") || prompt_main.equals("B3") || prompt_main.equals("b3") || prompt_main.equals("B4") || prompt_main.equals("b4") ||
                    prompt_main.equals("B5") || prompt_main.equals("b5") || prompt_main.equals("C1") || prompt_main.equals("c1") || prompt_main.equals("C3") || prompt_main.equals("c3") ||
                    prompt_main.equals("C4") || prompt_main.equals("c4") || prompt_main.equals("C5") || prompt_main.equals("c5") || prompt_main.equals("C6") || prompt_main.equals("c6") ||
                    prompt_main.equals("C7") || prompt_main.equals("c7") || prompt_main.equals("C8") || prompt_main.equals("c8") || prompt_main.equals("C9") || prompt_main.equals("c9") ||
                    prompt_main.equals("C10") || prompt_main.equals("c10") || prompt_main.equals("C11") || prompt_main.equals("c11") || prompt_main.equals("C12") || prompt_main.equals("c12") ||
                    prompt_main.equals("C13") || prompt_main.equals("c13") || prompt_main.equals("C14") || prompt_main.equals("c14") || prompt_main.equals("D1") || prompt_main.equals("d1") ||
                    prompt_main.equals("D2") || prompt_main.equals("d2") || prompt_main.equals("D3") || prompt_main.equals("d3") || prompt_main.equals("D4") || prompt_main.equals("d4") ||
                    prompt_main.equals("D5") || prompt_main.equals("d5") || prompt_main.equals("D6") || prompt_main.equals("d6") || prompt_main.equals("E1") || prompt_main.equals("e1") ||
                    prompt_main.equals("E2") || prompt_main.equals("e2") || prompt_main.equals("E3") || prompt_main.equals("e3") || prompt_main.equals("E4") || prompt_main.equals("e4")) && (err_catch2==1))){
                    for(int q=1; q<=max_count; q++){
                    if(q%max_count==0){
                        System.out.println(e);
                    }
                    else{
                        System.out.print(e);
                    }
                
                }
                System.out.println("(ERROR)►►►Unable to process. The function is not available at this page. Expand a category first.");
                }
                else if(prompt_main.equals("X") || prompt_main.equals("x")){
                    do{
                        for(int q=1; q<=max_count; q++){
                            if(q%max_count==0){
                                System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                
                        }
                        System.out.print("(PROMPT)►►►Are you sure you want to exit the program? If Yes, type [Y], otherwise No [N]: ");
                        prompt_main=main_scan.next();
                        
                        if(prompt_main.equals("Y") || prompt_main.equals("y")){
                            for(int q=1; q<=max_count; q++){
                                if(q%max_count==0){
                                    System.out.println(e);
                                }
                                else{
                                    System.out.print(e);
                                }
                
                            }
                            System.exit(0);
                        }
                        else if(prompt_main.equals("N") || prompt_main.equals("n")){
                        }
                        else{
                            for(int q=1; q<=max_count; q++){
                                if(q%max_count==0){
                                    System.out.println(e);
                                }
                                else{
                                    System.out.print(e);
                                }
                
                            }
                            System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                        }
                    }while(!(prompt_main.equals("N") || prompt_main.equals("n") || prompt_main.equals("Y") || prompt_main.equals("y")));
                    
                }
            }while(!(prompt_main.equals("EA") || prompt_main.equals("Ea") || prompt_main.equals("eA") || prompt_main.equals("ea") || prompt_main.equals("C") || prompt_main.equals("c") || prompt_main.equals("M") || prompt_main.equals("m") ||
                    prompt_main.equals("X") || prompt_main.equals("x") || prompt_main.equals("?") || prompt_main.equals("A") || prompt_main.equals("a") || prompt_main.equals("B") ||
                    prompt_main.equals("b") || prompt_main.equals("C") || prompt_main.equals("c") || prompt_main.equals("D") || prompt_main.equals("d") || prompt_main.equals("E") ||
                    prompt_main.equals("e") || prompt_main.equals("A1") || prompt_main.equals("a1") || prompt_main.equals("B1") || prompt_main.equals("b1") || prompt_main.equals("B2") ||
                    prompt_main.equals("b2") || prompt_main.equals("B3") || prompt_main.equals("b3") || prompt_main.equals("B4") || prompt_main.equals("b4") || prompt_main.equals("B5") ||
                    prompt_main.equals("b5") || prompt_main.equals("C1") || prompt_main.equals("c1") || prompt_main.equals("C2") || prompt_main.equals("c2") || prompt_main.equals("C3") || prompt_main.equals("c3") || prompt_main.equals("C4") ||
                    prompt_main.equals("c4") || prompt_main.equals("C5") || prompt_main.equals("c5") || prompt_main.equals("C6") || prompt_main.equals("c6") || prompt_main.equals("C7") ||
                    prompt_main.equals("c7") || prompt_main.equals("C8") || prompt_main.equals("c8") || prompt_main.equals("C9") || prompt_main.equals("c9") || prompt_main.equals("C10") ||
                    prompt_main.equals("c10") || prompt_main.equals("C11") || prompt_main.equals("c11") || prompt_main.equals("C12") || prompt_main.equals("c12") || prompt_main.equals("C13") ||
                    prompt_main.equals("c13") || prompt_main.equals("C14") || prompt_main.equals("c14") || prompt_main.equals("D1") || prompt_main.equals("d1") || prompt_main.equals("D2") ||
                    prompt_main.equals("d2") || prompt_main.equals("D3") || prompt_main.equals("d3") || prompt_main.equals("D4") || prompt_main.equals("d4") || prompt_main.equals("D5") ||
                    prompt_main.equals("d5") || prompt_main.equals("D6") || prompt_main.equals("d6") || prompt_main.equals("E1") || prompt_main.equals("e1") || prompt_main.equals("E2") ||
                    prompt_main.equals("e2") || prompt_main.equals("E3") || prompt_main.equals("e3") || prompt_main.equals("E4") || prompt_main.equals("e4")) ||
                    ((prompt_main.equals("EA") || prompt_main.equals("Ea") || prompt_main.equals("eA") || prompt_main.equals("ea") ||
                    prompt_main.equals("A1") || prompt_main.equals("a1") || prompt_main.equals("B1") || prompt_main.equals("b1") ||
                    prompt_main.equals("B2") || prompt_main.equals("b2") || prompt_main.equals("B3") || prompt_main.equals("b3") || prompt_main.equals("B4") || prompt_main.equals("b4") ||
                    prompt_main.equals("B5") || prompt_main.equals("b5") || prompt_main.equals("C1") || prompt_main.equals("c1") || prompt_main.equals("C3") || prompt_main.equals("c3") ||
                    prompt_main.equals("C4") || prompt_main.equals("c4") || prompt_main.equals("C5") || prompt_main.equals("c5") || prompt_main.equals("C6") || prompt_main.equals("c6") ||
                    prompt_main.equals("C7") || prompt_main.equals("c7") || prompt_main.equals("C8") || prompt_main.equals("c8") || prompt_main.equals("C9") || prompt_main.equals("c9") ||
                    prompt_main.equals("C10") || prompt_main.equals("c10") || prompt_main.equals("C11") || prompt_main.equals("c11") || prompt_main.equals("C12") || prompt_main.equals("c12") ||
                    prompt_main.equals("C13") || prompt_main.equals("c13") || prompt_main.equals("C14") || prompt_main.equals("c14") || prompt_main.equals("D1") || prompt_main.equals("d1") ||
                    prompt_main.equals("D2") || prompt_main.equals("d2") || prompt_main.equals("D3") || prompt_main.equals("d3") || prompt_main.equals("D4") || prompt_main.equals("d4") ||
                    prompt_main.equals("D5") || prompt_main.equals("d5") || prompt_main.equals("D6") || prompt_main.equals("d6") || prompt_main.equals("E1") || prompt_main.equals("e1") ||
                    prompt_main.equals("E2") || prompt_main.equals("e2") || prompt_main.equals("E3") || prompt_main.equals("e3") || prompt_main.equals("E4") || prompt_main.equals("e4") ||
                    prompt_main.equals("A") || prompt_main.equals("a") || prompt_main.equals("B") || prompt_main.equals("b") || prompt_main.equals("C") || prompt_main.equals("c") ||
                    prompt_main.equals("D") || prompt_main.equals("d") || prompt_main.equals("E") || prompt_main.equals("e")) && (err_catch==1)) || ((prompt_main.equals("A1") || prompt_main.equals("a1") || prompt_main.equals("B1") || prompt_main.equals("b1") ||
                    prompt_main.equals("B2") || prompt_main.equals("b2") || prompt_main.equals("B3") || prompt_main.equals("b3") || prompt_main.equals("B4") || prompt_main.equals("b4") ||
                    prompt_main.equals("B5") || prompt_main.equals("b5") || prompt_main.equals("C1") || prompt_main.equals("c1") || prompt_main.equals("C3") || prompt_main.equals("c3") ||
                    prompt_main.equals("C4") || prompt_main.equals("c4") || prompt_main.equals("C5") || prompt_main.equals("c5") || prompt_main.equals("C6") || prompt_main.equals("c6") ||
                    prompt_main.equals("C7") || prompt_main.equals("c7") || prompt_main.equals("C8") || prompt_main.equals("c8") || prompt_main.equals("C9") || prompt_main.equals("c9") ||
                    prompt_main.equals("C10") || prompt_main.equals("c10") || prompt_main.equals("C11") || prompt_main.equals("c11") || prompt_main.equals("C12") || prompt_main.equals("c12") ||
                    prompt_main.equals("C13") || prompt_main.equals("c13") || prompt_main.equals("C14") || prompt_main.equals("c14") || prompt_main.equals("D1") || prompt_main.equals("d1") ||
                    prompt_main.equals("D2") || prompt_main.equals("d2") || prompt_main.equals("D3") || prompt_main.equals("d3") || prompt_main.equals("D4") || prompt_main.equals("d4") ||
                    prompt_main.equals("D5") || prompt_main.equals("d5") || prompt_main.equals("D6") || prompt_main.equals("d6") || prompt_main.equals("E1") || prompt_main.equals("e1") ||
                    prompt_main.equals("E2") || prompt_main.equals("e2") || prompt_main.equals("E3") || prompt_main.equals("e3") || prompt_main.equals("E4") || prompt_main.equals("e4")) && (err_catch2==1)));
            for(int q=1; q<=max_count; q++){
                char e='.';
                if(q%max_count==0){
                    System.out.println(e+"\n");
                }
                else{
                    System.out.print(e);
                }
                
            }
            //End of Main Prompt
            
            
            
/*
----------------------------------------END OF MAIN MENU----------------------------------------
*/
            //A1
            if(prompt_main.equals("A1") || prompt_main.equals("a1")){
                do{
                String display="";
                //Input confirmation
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                
                    }
                    System.out.print("(PROMPT)►►►Do you want to keep the default output of the program [Y], or not [N]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("Y") || prompt_sub.equals("y")){
                        prompt_sub="0";
                        break;
                    }
                    else if(prompt_sub.equals("N") || prompt_sub.equals("n")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="1";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("Y") || prompt_sub.equals("y") || prompt_sub.equals("N") || prompt_sub.equals("n")));
                //End of Input confirmation
                
                //Default
                if(prompt_sub.equals("0")){
                    for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                    display="Hello World!";
                }
                //End of Default
                
                //Scanner
                else if(prompt_sub.equals("1")){ 
                        System.out.print("(PROMPT)►►►Enter a text: ");
                        display=main_scan.next();
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    
                }
                //End of Scanner

                //Program header
                System.out.println();
                for(int q=1; q<=max_count; q++){
                    String w=("|| A1 - "+a_list[0]+" ||");
                    String w1=("|| A1 - Display \""+display+"\" Program ||");
                    char e='_';
                    if(prompt_sub.equals("0")){
                        if((q==((max_count-w.length())/2)+1)){
                            System.out.print(w); q+=w.length()-1;
                        }
                        else{
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                    }
                    else if(prompt_sub.equals("1")){
                        if((q==((max_count-w1.length())/2)+1)){
                            System.out.print(w1); q+=w1.length()-1;
                        }
                        else{
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                    }
                }
                //End of Program header
                
                //Display output
                System.out.println();
                System.out.print(display);
                System.out.println();
                //End of Display output
                
                //Program footer
                for(int q=1; q<=max_count; q++){
                    char e='_';
                    if(q%max_count==0){
                        System.out.println(e);
                    }
                    else{
                        System.out.print(e);
                    }
                }
                System.out.println();
                //End of Program footer
                
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    System.out.print("(PROMPT)►►►Repeat the program [R], or go back to Main Menu [M]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("R") || prompt_sub.equals("r")){
                        prompt_sub="R";
                        break;
                    }
                    else if(prompt_sub.equals("M") || prompt_sub.equals("m")){
                        prompt_main="M";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("M") || prompt_sub.equals("M") || prompt_sub.equals("R") || prompt_sub.equals("r")));
                for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e+"\n");
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                }while(prompt_sub.equals("R") || prompt_sub.equals("r"));
            }
            //End of A1
            
            //B1
            else if(prompt_main.equals("B1") || prompt_main.equals("b1")){
                do{
                String display=""; int sum=0, cnt=0, str=0, tot=0;
                int[] addend=new int[0];
                int[] addend2={5,10,15,20,25,30,35,40,45,50};
                //Input confirmation
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                
                    }
                    System.out.print("(PROMPT)►►►Do you want to keep the default output of the program [Y], or not [N]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("Y") || prompt_sub.equals("y")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="1";
                        break;
                    }
                    else if(prompt_sub.equals("N") || prompt_sub.equals("n")){
                        prompt_sub="0";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("Y") || prompt_sub.equals("y") || prompt_sub.equals("N") || prompt_sub.equals("n")));
                //End of Input confirmation
                
                //Default
                //End of Default
                
                //Scanner
                if(prompt_sub.equals("0")){ 
                    do{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        if(cnt==0){
                            System.out.print("(PROMPT)►►►How many numbers do you want to add? ");
                            tot=main_scan.nextInt();
                            addend=new int[tot];
                            cnt++;
                        }
                        else{
                            System.out.print("(PROMPT)►►►"+cnt+" - Number to be added: ");
                            str=main_scan.nextInt();
                            addend[(cnt-1)]=str;
                            sum+=str;
                            cnt++;                            
                        }
                    }while(cnt<=tot);
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    
                }
                //End of Scanner

                //Program header
                System.out.println();
                for(int q=1; q<=max_count; q++){
                    String w=("|| B1 - "+b_list[0]+" ||");
                    String w1=("|| B1 - "+display+" Program ||");
                    char e='_';
                        if((q==((max_count-w.length())/2)+1)){
                            System.out.print(w); q+=w.length()-1;
                        }
                        else{
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                }
                //End of Program header
                
                //Display output
                System.out.println();
                if(prompt_sub.equals("1")){
                    for(int q=0; q<addend2.length; q++){
                        sum+=addend2[q];
                    if(q>addend2.length-2&&q<addend2.length){
                        System.out.print(addend2[q]+" = ");
                    }
                    else{
                        System.out.print(addend2[q]+" + ");
                    }
                }
                }
                else{
                    for(int q=0; q<addend.length; q++){
                    if(q>addend.length-2&&q<addend.length){
                        System.out.print(addend[q]+" = ");
                    }
                    else{
                        System.out.print(addend[q]+" + ");
                    }
                }
                }
                
                System.out.print(sum);
                System.out.println();
                //End of Display output
                
                //Program footer
                for(int q=1; q<=max_count; q++){
                    char e='_';
                    if(q%max_count==0){
                        System.out.println(e);
                    }
                    else{
                        System.out.print(e);
                    }
                }
                System.out.println();
                //End of Program footer
                
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    System.out.print("(PROMPT)►►►Repeat the program [R], or go back to Main Menu [M]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("R") || prompt_sub.equals("r")){
                        prompt_sub="R";
                        break;
                    }
                    else if(prompt_sub.equals("M") || prompt_sub.equals("m")){
                        prompt_main="M";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("M") || prompt_sub.equals("M") || prompt_sub.equals("R") || prompt_sub.equals("r")));
                for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e+"\n");
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                }while(prompt_sub.equals("R") || prompt_sub.equals("r"));
            }
            //End of B1
            
            //B2
            else if(prompt_main.equals("B2") || prompt_main.equals("b2")){
                do{
                String display=""; int sum=0, cnt=0, str=0, tot=0;
                int[] addend=new int[0];
                int[] addend2={5,10,15,20,25,30,35,40,45,50};
                //Input confirmation
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                
                    }
                    System.out.print("(PROMPT)►►►Do you want to keep the default output of the program [Y], or not [N]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("Y") || prompt_sub.equals("y")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="1";
                        break;
                    }
                    else if(prompt_sub.equals("N") || prompt_sub.equals("n")){
                        prompt_sub="0";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("Y") || prompt_sub.equals("y") || prompt_sub.equals("N") || prompt_sub.equals("n")));
                //End of Input confirmation
                
                //Default
                //End of Default
                
                //Scanner
                if(prompt_sub.equals("0")){ 
                    do{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        if(cnt==0){
                            System.out.print("(PROMPT)►►►How many numbers do you want to subtract? ");
                            tot=main_scan.nextInt();
                            addend=new int[tot];
                            cnt++;
                        }
                        else{
                            System.out.print("(PROMPT)►►►"+cnt+" - Number to be subtracted: ");
                            str=main_scan.nextInt();
                            addend[(cnt-1)]=str;
                            if(cnt==1){
                                sum+=str;
                            }
                            else{
                                sum-=str;
                            }
                            cnt++;                            
                        }
                    }while(cnt<=tot);
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    
                }
                //End of Scanner

                //Program header
                System.out.println();
                for(int q=1; q<=max_count; q++){
                    String w=("|| B2 - "+b_list[1]+" ||");
                    String w1=("|| B2 - "+display+" Program ||");
                    char e='_';
                        if((q==((max_count-w.length())/2)+1)){
                            System.out.print(w); q+=w.length()-1;
                        }
                        else{
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                }
                //End of Program header
                
                //Display output
                System.out.println();
                if(prompt_sub.equals("1")){
                    for(int q=0; q<addend2.length; q++){
                        if(q==0){
                            sum+=addend2[q];
                        }
                        else{
                            sum-=addend2[q];
                        }
                    if(q>addend2.length-2&&q<addend2.length){
                        System.out.print(addend2[q]+" = ");
                    }
                    else{
                        System.out.print(addend2[q]+" - ");
                    }
                }
                }
                else{
                    for(int q=0; q<addend.length; q++){
                    if(q>addend.length-2&&q<addend.length){
                        System.out.print(addend[q]+" = ");
                    }
                    else{
                        System.out.print(addend[q]+" - ");
                    }
                }
                }
                
                System.out.print(sum);
                System.out.println();
                //End of Display output
                
                //Program footer
                for(int q=1; q<=max_count; q++){
                    char e='_';
                    if(q%max_count==0){
                        System.out.println(e);
                    }
                    else{
                        System.out.print(e);
                    }
                }
                System.out.println();
                //End of Program footer
                
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    System.out.print("(PROMPT)►►►Repeat the program [R], or go back to Main Menu [M]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("R") || prompt_sub.equals("r")){
                        prompt_sub="R";
                        break;
                    }
                    else if(prompt_sub.equals("M") || prompt_sub.equals("m")){
                        prompt_main="M";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("M") || prompt_sub.equals("M") || prompt_sub.equals("R") || prompt_sub.equals("r")));
                for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e+"\n");
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                }while(prompt_sub.equals("R") || prompt_sub.equals("r"));
            }
            //End of B2
            
            //B3
            else if(prompt_main.equals("B3") || prompt_main.equals("b3")){
                do{
                String display=""; int sum=1, cnt=0, str=0, tot=0;
                int[] addend=new int[0];
                int[] addend2={1,2,3,4,5,6,7,8,9,10};
                //Input confirmation
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                
                    }
                    System.out.print("(PROMPT)►►►Do you want to keep the default output of the program [Y], or not [N]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("Y") || prompt_sub.equals("y")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="1";
                        break;
                    }
                    else if(prompt_sub.equals("N") || prompt_sub.equals("n")){
                        prompt_sub="0";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("Y") || prompt_sub.equals("y") || prompt_sub.equals("N") || prompt_sub.equals("n")));
                //End of Input confirmation
                
                //Default
                //End of Default
                
                //Scanner
                if(prompt_sub.equals("0")){ 
                    do{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        if(cnt==0){
                            System.out.print("(PROMPT)►►►How many numbers do you want to multiply? ");
                            tot=main_scan.nextInt();
                            addend=new int[tot];
                            cnt++;
                        }
                        else{
                            System.out.print("(PROMPT)►►►"+cnt+" - Number to be multiplied: ");
                            str=main_scan.nextInt();
                            addend[(cnt-1)]=str;
                            sum*=str;
                            cnt++;                            
                        }
                    }while(cnt<=tot);
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    
                }
                //End of Scanner

                //Program header
                System.out.println();
                for(int q=1; q<=max_count; q++){
                    String w=("|| B3 - "+b_list[2]+" ||");
                    String w1=("|| B3 - "+display+" Program ||");
                    char e='_';
                        if((q==((max_count-w.length())/2)+1)){
                            System.out.print(w); q+=w.length()-1;
                        }
                        else{
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                }
                //End of Program header
                
                //Display output
                System.out.println();
                if(prompt_sub.equals("1")){
                    for(int q=0; q<addend2.length; q++){
                        sum*=addend2[q];
                    if(q>addend2.length-2&&q<addend2.length){
                        System.out.print(addend2[q]+" = ");
                    }
                    else{
                        System.out.print(addend2[q]+" * ");
                    }
                }
                }
                else{
                    for(int q=0; q<addend.length; q++){
                    if(q>addend.length-2&&q<addend.length){
                        System.out.print(addend[q]+" = ");
                    }
                    else{
                        System.out.print(addend[q]+" * ");
                    }
                }
                }
                System.out.print(sum);
                System.out.println();
                //End of Display output
                
                //Program footer
                for(int q=1; q<=max_count; q++){
                    char e='_';
                    if(q%max_count==0){
                        System.out.println(e);
                    }
                    else{
                        System.out.print(e);
                    }
                }
                System.out.println();
                //End of Program footer
                
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    System.out.print("(PROMPT)►►►Repeat the program [R], or go back to Main Menu [M]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("R") || prompt_sub.equals("r")){
                        prompt_sub="R";
                        break;
                    }
                    else if(prompt_sub.equals("M") || prompt_sub.equals("m")){
                        prompt_main="M";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("M") || prompt_sub.equals("M") || prompt_sub.equals("R") || prompt_sub.equals("r")));
                for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e+"\n");
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                }while(prompt_sub.equals("R") || prompt_sub.equals("r"));
            }
            //End of B3
            
            //B4
            else if(prompt_main.equals("B4") || prompt_main.equals("b4")){
                do{
                String display=""; double sum=0, str=0; int cnt=0, tot=0;
                double[] addend=new double[0];
                double[] addend2={50,0.5,1,2,3,6,7,8,9,10};
                //Input confirmation
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                
                    }
                    System.out.print("(PROMPT)►►►Do you want to keep the default output of the program [Y], or not [N]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("Y") || prompt_sub.equals("y")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="1";
                        break;
                    }
                    else if(prompt_sub.equals("N") || prompt_sub.equals("n")){
                        prompt_sub="0";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("Y") || prompt_sub.equals("y") || prompt_sub.equals("N") || prompt_sub.equals("n")));
                //End of Input confirmation
                
                //Default
                //End of Default
                
                //Scanner
                if(prompt_sub.equals("0")){ 
                    do{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        if(cnt==0){
                            System.out.print("(PROMPT)►►►How many numbers do you want to divide? ");
                            tot=main_scan.nextInt();
                            addend=new double[tot];
                            cnt++;
                        }
                        else{
                            System.out.print("(PROMPT)►►►"+cnt+" - Number to be divided: ");
                            str=main_scan.nextInt();
                            addend[(cnt-1)]=str;
                            if(cnt==1){
                                sum+=str;
                            }
                            else{
                                sum/=str;
                            }
                            cnt++;                            
                        }
                    }while(cnt<=tot);
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    
                }
                //End of Scanner

                //Program header
                System.out.println();
                for(int q=1; q<=max_count; q++){
                    String w=("|| B4 - "+b_list[3]+" ||");
                    String w1=("|| B4 - "+display+" Program ||");
                    char e='_';
                        if((q==((max_count-w.length())/2)+1)){
                            System.out.print(w); q+=w.length()-1;
                        }
                        else{
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                }
                //End of Program header
                
                //Display output
                System.out.println();
                if(prompt_sub.equals("1")){
                    for(int q=0; q<addend2.length; q++){
                        if(q==0){
                            sum+=addend2[q];
                        }
                        else{
                            sum/=addend2[q];
                        }
                    if(q>addend2.length-2&&q<addend2.length){
                        System.out.print(addend2[q]+" = ");
                    }
                    else{
                        System.out.print(addend2[q]+" ÷ ");
                    }
                }
                }
                else{
                    for(int q=0; q<addend.length; q++){
                    if(q>addend.length-2&&q<addend.length){
                        System.out.print(addend[q]+" = ");
                    }
                    else{
                        System.out.print(addend[q]+" ÷ ");
                    }
                }
                }
                System.out.print(sum);
                System.out.println();
                //End of Display output
                
                //Program footer
                for(int q=1; q<=max_count; q++){
                    char e='_';
                    if(q%max_count==0){
                        System.out.println(e);
                    }
                    else{
                        System.out.print(e);
                    }
                }
                System.out.println();
                //End of Program footer
                
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    System.out.print("(PROMPT)►►►Repeat the program [R], or go back to Main Menu [M]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("R") || prompt_sub.equals("r")){
                        prompt_sub="R";
                        break;
                    }
                    else if(prompt_sub.equals("M") || prompt_sub.equals("m")){
                        prompt_main="M";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("M") || prompt_sub.equals("M") || prompt_sub.equals("R") || prompt_sub.equals("r")));
                for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e+"\n");
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                }while(prompt_sub.equals("R") || prompt_sub.equals("r"));
            }
            //End of B4
            
            //B5
            else if(prompt_main.equals("B5") || prompt_main.equals("b5")){
                do{
                String display=""; double sum=0, str=0; int cnt=0, tot=0;
                double[] addend=new double[0];
                double[] addend2={32,26,25,23,22,21,18,17,10};
                //Input confirmation
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                
                    }
                    System.out.print("(PROMPT)►►►Do you want to keep the default output of the program [Y], or not [N]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("Y") || prompt_sub.equals("y")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="1";
                        break;
                    }
                    else if(prompt_sub.equals("N") || prompt_sub.equals("n")){
                        prompt_sub="0";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("Y") || prompt_sub.equals("y") || prompt_sub.equals("N") || prompt_sub.equals("n")));
                //End of Input confirmation
                
                //Default
                //End of Default
                
                //Scanner
                if(prompt_sub.equals("0")){ 
                    do{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        if(cnt==0){
                            System.out.print("(PROMPT)►►►How many numbers do you want to be divided and return the remainder? ");
                            tot=main_scan.nextInt();
                            addend=new double[tot];
                            cnt++;
                        }
                        else{
                            System.out.print("(PROMPT)►►►"+cnt+" - Number to be divided: ");
                            str=main_scan.nextInt();
                            addend[(cnt-1)]=str;
                            if(cnt==1){
                                sum+=str;
                            }
                            else{
                                sum%=str;
                            }
                            cnt++;                            
                        }
                    }while(cnt<=tot);
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    
                }
                //End of Scanner

                //Program header
                System.out.println();
                for(int q=1; q<=max_count; q++){
                    String w=("|| B5 - "+b_list[4]+" ||");
                    String w1=("|| B5 - "+display+" Program ||");
                    char e='_';
                        if((q==((max_count-w.length())/2)+1)){
                            System.out.print(w); q+=w.length()-1;
                        }
                        else{
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                }
                //End of Program header
                
                //Display output
                System.out.println();
                if(prompt_sub.equals("1")){
                    for(int q=0; q<addend2.length; q++){
                        if(q==0){
                            sum+=addend2[q];
                        }
                        else{
                            sum%=addend2[q];
                        }
                    if(q>addend2.length-2&&q<addend2.length){
                        System.out.print(addend2[q]+" = ");
                    }
                    else{
                        System.out.print(addend2[q]+" % ");
                    }
                }
                }
                else{
                    for(int q=0; q<addend.length; q++){
                    if(q>addend.length-2&&q<addend.length){
                        System.out.print(addend[q]+" = ");
                    }
                    else{
                        System.out.print(addend[q]+" % ");
                    }
                }
                }
                System.out.print(sum);
                System.out.println();
                //End of Display output
                
                //Program footer
                for(int q=1; q<=max_count; q++){
                    char e='_';
                    if(q%max_count==0){
                        System.out.println(e);
                    }
                    else{
                        System.out.print(e);
                    }
                }
                System.out.println();
                //End of Program footer
                
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    System.out.print("(PROMPT)►►►Repeat the program [R], or go back to Main Menu [M]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("R") || prompt_sub.equals("r")){
                        prompt_sub="R";
                        break;
                    }
                    else if(prompt_sub.equals("M") || prompt_sub.equals("m")){
                        prompt_main="M";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("M") || prompt_sub.equals("M") || prompt_sub.equals("R") || prompt_sub.equals("r")));
                for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e+"\n");
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                }while(prompt_sub.equals("R") || prompt_sub.equals("r"));
            }
            //End of B5
            
            //C1
            else if(prompt_main.equals("C1") || prompt_main.equals("c1")){
                do{
                double salary=0, rate=0, hours=0;
                //Input confirmation
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                
                    }
                    System.out.print("(PROMPT)►►►Do you want to keep the default output of the program [Y], or not [N]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("Y") || prompt_sub.equals("y")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="1";
                        break;
                    }
                    else if(prompt_sub.equals("N") || prompt_sub.equals("n")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="0";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("Y") || prompt_sub.equals("y") || prompt_sub.equals("N") || prompt_sub.equals("n")));
                //End of Input confirmation
                
                //Default
                if(prompt_sub.equals("1")){
                    rate=12.5; hours=12; salary=rate*hours;
                }
                //End of Default
                
                //Scanner
                else if(prompt_sub.equals("0")){ 
                    System.out.print("(PROMPT)►►►What is the total rate per hour (In PHP)? ");
                    rate=main_scan.nextDouble();
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    System.out.print("(PROMPT)►►►What is the total working hour(s)? ");
                    hours=main_scan.nextDouble();
                    salary=rate*hours;
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    
                }
                //End of Scanner

                //Program header
                
                System.out.println();
                for(int q=1; q<=max_count; q++){
                    String w=("|| C1 - "+c_list[0]+" ||");
                    char e='_';
                        if((q==((max_count-w.length())/2)+1)){
                            System.out.print(w); q+=w.length()-1;
                        }
                        else{
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                }
                //End of Program header
                
                //Display output
                System.out.println();
                System.out.print("The total salary for ₱"+rate+" per hour with "+hours+" working hours is ₱"+salary+".");
                System.out.println();
                //End of Display output
                
                //Program footer
                for(int q=1; q<=max_count; q++){
                    char e='_';
                    if(q%max_count==0){
                        System.out.println(e);
                    }
                    else{
                        System.out.print(e);
                    }
                }
                System.out.println();
                //End of Program footer
                
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    System.out.print("(PROMPT)►►►Repeat the program [R], or go back to Main Menu [M]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("R") || prompt_sub.equals("r")){
                        prompt_sub="R";
                        break;
                    }
                    else if(prompt_sub.equals("M") || prompt_sub.equals("m")){
                        prompt_main="M";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("M") || prompt_sub.equals("M") || prompt_sub.equals("R") || prompt_sub.equals("r")));
                for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e+"\n");
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                }while(prompt_sub.equals("R") || prompt_sub.equals("r"));
            }
            //End of C1
            
            //C2
            else if(prompt_main.equals("C2") || prompt_main.equals("c2")){
                do{
                double change=0, cash=0, total=0;
                //Input confirmation
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                
                    }
                    System.out.print("(PROMPT)►►►Do you want to keep the default output of the program [Y], or not [N]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("Y") || prompt_sub.equals("y")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="1";
                        break;
                    }
                    else if(prompt_sub.equals("N") || prompt_sub.equals("n")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="0";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("Y") || prompt_sub.equals("y") || prompt_sub.equals("N") || prompt_sub.equals("n")));
                //End of Input confirmation
                
                //Default
                if(prompt_sub.equals("1")){
                    total=2314; cash=2500; change=cash-total;
                }
                //End of Default
                
                //Scanner
                else if(prompt_sub.equals("0")){ 
                    System.out.print("(PROMPT)►►►What is the total amount due (In PHP)? ");
                    total=main_scan.nextDouble();
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    System.out.print("(PROMPT)►►►What is the total amount of money on hand (In PHP)? ");
                    cash=main_scan.nextDouble();
                    change=cash-total;
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    
                }
                //End of Scanner

                //Program header
                
                System.out.println();
                for(int q=1; q<=max_count; q++){
                    String w=("|| C2 - "+c_list[1]+" ||");
                    char e='_';
                        if((q==((max_count-w.length())/2)+1)){
                            System.out.print(w); q+=w.length()-1;
                        }
                        else{
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                }
                //End of Program header
                
                //Display output
                System.out.println();
                System.out.print("The total change for ₱"+cash+" cash on hand and ₱"+total+" amount due is ₱"+change+".");
                System.out.println();
                //End of Display output
                
                //Program footer
                for(int q=1; q<=max_count; q++){
                    char e='_';
                    if(q%max_count==0){
                        System.out.println(e);
                    }
                    else{
                        System.out.print(e);
                    }
                }
                System.out.println();
                //End of Program footer
                
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    System.out.print("(PROMPT)►►►Repeat the program [R], or go back to Main Menu [M]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("R") || prompt_sub.equals("r")){
                        prompt_sub="R";
                        break;
                    }
                    else if(prompt_sub.equals("M") || prompt_sub.equals("m")){
                        prompt_main="M";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("M") || prompt_sub.equals("M") || prompt_sub.equals("R") || prompt_sub.equals("r")));
                for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e+"\n");
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                }while(prompt_sub.equals("R") || prompt_sub.equals("r"));
            }
            //End of C2
            
            //C3
            else if(prompt_main.equals("C3") || prompt_main.equals("c3")){
                do{
                double tax=0, price=0, tax_am=0;
                //Input confirmation
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                
                    }
                    System.out.print("(PROMPT)►►►Do you want to keep the default output of the program [Y], or not [N]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("Y") || prompt_sub.equals("y")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="1";
                        break;
                    }
                    else if(prompt_sub.equals("N") || prompt_sub.equals("n")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="0";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("Y") || prompt_sub.equals("y") || prompt_sub.equals("N") || prompt_sub.equals("n")));
                //End of Input confirmation
                
                //Default
                if(prompt_sub.equals("1")){
                    tax=13.5; price=2500; tax_am=(tax*0.01)*price;
                }
                //End of Default
                
                //Scanner
                else if(prompt_sub.equals("0")){ 
                    System.out.print("(PROMPT)►►►What is the price of the item (In PHP)? ");
                    price=main_scan.nextDouble();
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    System.out.print("(PROMPT)►►►What is the percentage of tax added? ");
                    tax=main_scan.nextDouble();
                    tax_am=(tax*0.01)*price;
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    
                }
                //End of Scanner

                //Program header
                
                System.out.println();
                for(int q=1; q<=max_count; q++){
                    String w=("|| C3 - "+c_list[2]+" ||");
                    char e='_';
                        if((q==((max_count-w.length())/2)+1)){
                            System.out.print(w); q+=w.length()-1;
                        }
                        else{
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                }
                //End of Program header
                
                //Display output
                System.out.println();
                System.out.print("The total tax amount for ₱"+price+" item with "+tax+"% added tax is ₱"+tax_am+".");
                System.out.println();
                //End of Display output
                
                //Program footer
                for(int q=1; q<=max_count; q++){
                    char e='_';
                    if(q%max_count==0){
                        System.out.println(e);
                    }
                    else{
                        System.out.print(e);
                    }
                }
                System.out.println();
                //End of Program footer
                
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    System.out.print("(PROMPT)►►►Repeat the program [R], or go back to Main Menu [M]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("R") || prompt_sub.equals("r")){
                        prompt_sub="R";
                        break;
                    }
                    else if(prompt_sub.equals("M") || prompt_sub.equals("m")){
                        prompt_main="M";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("M") || prompt_sub.equals("M") || prompt_sub.equals("R") || prompt_sub.equals("r")));
                for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e+"\n");
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                }while(prompt_sub.equals("R") || prompt_sub.equals("r"));
            }
            //End of C3
            
            //C4
            else if(prompt_main.equals("C4") || prompt_main.equals("c4")){
                do{
                double[] num={0}; int cnt=0, tot=0, sum=0;
                //Input confirmation
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                
                    }
                    System.out.print("(PROMPT)►►►Do you want to keep the default output of the program [Y], or not [N]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("Y") || prompt_sub.equals("y")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="1";
                        break;
                    }
                    else if(prompt_sub.equals("N") || prompt_sub.equals("n")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="0";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("Y") || prompt_sub.equals("y") || prompt_sub.equals("N") || prompt_sub.equals("n")));
                //End of Input confirmation
                
                //Default
                if(prompt_sub.equals("1")){
                    double[] num1={10,3,13,54,13,67,12,6,78,10};
                    num=new double[num1.length];
                    while(cnt<num.length){
                        num[cnt]=num1[cnt]; cnt++;
                    }
                }
                //End of Default
                
                //Scanner
                else if(prompt_sub.equals("0")){ 
                    System.out.print("(PROMPT)►►►How many number(s) involved to get the average? ");
                    tot=main_scan.nextInt();
                    num=new double[tot];
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    while(cnt<tot){
                        System.out.print("(PROMPT)►►►"+(cnt+1)+" - Number to be added: ");
                        num[cnt]=main_scan.nextDouble();
                        cnt++;
                        for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    }
                    
                    
                }
                //End of Scanner

                //Program header
                
                System.out.println();
                for(int q=1; q<=max_count; q++){
                    String w=("|| C4 - "+c_list[3]+" ||");
                    char e='_';
                        if((q==((max_count-w.length())/2)+1)){
                            System.out.print(w); q+=w.length()-1;
                        }
                        else{
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                }
                //End of Program header
                
                //Display output
                System.out.println();
                for(int q=0; q<num.length; q++){
                    sum+=num[q];
                    if(q==(num.length-1)){
                        System.out.print(num[q]+") / "+num.length+" = ");
                    }
                    else if(q==(num.length-num.length)){
                        System.out.print("("+num[q]+" + ");
                    }
                    else {
                        System.out.print(num[q]+" + ");
                    }
                }
                System.out.print((sum/num.length));
                System.out.println();
                //End of Display output
                
                //Program footer
                for(int q=1; q<=max_count; q++){
                    char e='_';
                    if(q%max_count==0){
                        System.out.println(e);
                    }
                    else{
                        System.out.print(e);
                    }
                }
                System.out.println();
                //End of Program footer
                
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    System.out.print("(PROMPT)►►►Repeat the program [R], or go back to Main Menu [M]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("R") || prompt_sub.equals("r")){
                        prompt_sub="R";
                        break;
                    }
                    else if(prompt_sub.equals("M") || prompt_sub.equals("m")){
                        prompt_main="M";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("M") || prompt_sub.equals("M") || prompt_sub.equals("R") || prompt_sub.equals("r")));
                for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e+"\n");
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                }while(prompt_sub.equals("R") || prompt_sub.equals("r"));
            }
            //End of C4
            
            //C5
            else if(prompt_main.equals("C5") || prompt_main.equals("c5")){
                do{
                double pi=3.1416, rad=0, circum=0;
                //Input confirmation
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                
                    }
                    System.out.print("(PROMPT)►►►Do you want to keep the default output of the program [Y], or not [N]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("Y") || prompt_sub.equals("y")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="1";
                        break;
                    }
                    else if(prompt_sub.equals("N") || prompt_sub.equals("n")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="0";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("Y") || prompt_sub.equals("y") || prompt_sub.equals("N") || prompt_sub.equals("n")));
                //End of Input confirmation
                
                //Default
                if(prompt_sub.equals("1")){
                    rad=25; circum=2*pi*rad;
                }
                //End of Default
                
                //Scanner
                else if(prompt_sub.equals("0")){ 
                    System.out.print("(PROMPT)►►►What is the radius of the circle? ");
                    rad=main_scan.nextDouble();
                    circum=2*pi*rad;
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }   
                }
                //End of Scanner

                //Program header
                System.out.println();
                for(int q=1; q<=max_count; q++){
                    String w=("|| C5 - "+c_list[4]+" ||");
                    char e='_';
                        if((q==((max_count-w.length())/2)+1)){
                            System.out.print(w); q+=w.length()-1;
                        }
                        else{
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                }
                //End of Program header
                
                //Display output
                System.out.println();
                System.out.print("The circumference of a circle with a radius of "+rad+" is "+circum+".");
                System.out.println();
                //End of Display output
                
                //Program footer
                for(int q=1; q<=max_count; q++){
                    char e='_';
                    if(q%max_count==0){
                        System.out.println(e);
                    }
                    else{
                        System.out.print(e);
                    }
                }
                System.out.println();
                //End of Program footer
                
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    System.out.print("(PROMPT)►►►Repeat the program [R], or go back to Main Menu [M]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("R") || prompt_sub.equals("r")){
                        prompt_sub="R";
                        break;
                    }
                    else if(prompt_sub.equals("M") || prompt_sub.equals("m")){
                        prompt_main="M";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("M") || prompt_sub.equals("M") || prompt_sub.equals("R") || prompt_sub.equals("r")));
                for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e+"\n");
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                }while(prompt_sub.equals("R") || prompt_sub.equals("r"));
            }
            //End of C5
            
            //C6
            else if(prompt_main.equals("C6") || prompt_main.equals("c6")){
                do{
                double le=0, wi=0, area=0;
                //Input confirmation
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                
                    }
                    System.out.print("(PROMPT)►►►Do you want to keep the default output of the program [Y], or not [N]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("Y") || prompt_sub.equals("y")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="1";
                        break;
                    }
                    else if(prompt_sub.equals("N") || prompt_sub.equals("n")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="0";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("Y") || prompt_sub.equals("y") || prompt_sub.equals("N") || prompt_sub.equals("n")));
                //End of Input confirmation
                
                //Default
                if(prompt_sub.equals("1")){
                    le=25.32; wi=32.7; area=le*wi;
                }
                //End of Default
                
                //Scanner
                else if(prompt_sub.equals("0")){ 
                    System.out.print("(PROMPT)►►►What is the length of the rectangle? ");
                    le=main_scan.nextDouble();
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    System.out.print("(PROMPT)►►►What is the width of the rectangle? ");
                    wi=main_scan.nextDouble();
                    area=le*wi;
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    } 
                }
                //End of Scanner

                //Program header
                System.out.println();
                for(int q=1; q<=max_count; q++){
                    String w=("|| C6 - "+c_list[5]+" ||");
                    char e='_';
                        if((q==((max_count-w.length())/2)+1)){
                            System.out.print(w); q+=w.length()-1;
                        }
                        else{
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                }
                //End of Program header
                
                //Display output
                System.out.println();
                System.out.print("The area of a rectangle with a length of "+le+" and width of "+wi+" is "+area+".");
                System.out.println();
                //End of Display output
                
                //Program footer
                for(int q=1; q<=max_count; q++){
                    char e='_';
                    if(q%max_count==0){
                        System.out.println(e);
                    }
                    else{
                        System.out.print(e);
                    }
                }
                System.out.println();
                //End of Program footer
                
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    System.out.print("(PROMPT)►►►Repeat the program [R], or go back to Main Menu [M]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("R") || prompt_sub.equals("r")){
                        prompt_sub="R";
                        break;
                    }
                    else if(prompt_sub.equals("M") || prompt_sub.equals("m")){
                        prompt_main="M";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("M") || prompt_sub.equals("M") || prompt_sub.equals("R") || prompt_sub.equals("r")));
                for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e+"\n");
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                }while(prompt_sub.equals("R") || prompt_sub.equals("r"));
            }
            //End of C6
            
            //C7
            else if(prompt_main.equals("C7") || prompt_main.equals("c7")){
                do{
                double pi=3.1416, r=0, area=0;
                //Input confirmation
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                
                    }
                    System.out.print("(PROMPT)►►►Do you want to keep the default output of the program [Y], or not [N]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("Y") || prompt_sub.equals("y")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="1";
                        break;
                    }
                    else if(prompt_sub.equals("N") || prompt_sub.equals("n")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="0";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("Y") || prompt_sub.equals("y") || prompt_sub.equals("N") || prompt_sub.equals("n")));
                //End of Input confirmation
                
                //Default
                if(prompt_sub.equals("1")){
                    r=17.82; area=pi*r*r;
                }
                //End of Default
                
                //Scanner
                else if(prompt_sub.equals("0")){ 
                    System.out.print("(PROMPT)►►►What is the radius of the sphere? ");
                    r=main_scan.nextDouble();
                    area=(pi*r*r);
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                }
                //End of Scanner

                //Program header
                System.out.println();
                for(int q=1; q<=max_count; q++){
                    String w=("|| C7 - "+c_list[6]+" ||");
                    char e='_';
                        if((q==((max_count-w.length())/2)+1)){
                            System.out.print(w); q+=w.length()-1;
                        }
                        else{
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                }
                //End of Program header
                
                //Display output
                System.out.println();
                System.out.print("The area of the circle with a radius of "+r+" is "+area+".");
                System.out.println();
                //End of Display output
                
                //Program footer
                for(int q=1; q<=max_count; q++){
                    char e='_';
                    if(q%max_count==0){
                        System.out.println(e);
                    }
                    else{
                        System.out.print(e);
                    }
                }
                System.out.println();
                //End of Program footer
                
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    System.out.print("(PROMPT)►►►Repeat the program [R], or go back to Main Menu [M]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("R") || prompt_sub.equals("r")){
                        prompt_sub="R";
                        break;
                    }
                    else if(prompt_sub.equals("M") || prompt_sub.equals("m")){
                        prompt_main="M";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("M") || prompt_sub.equals("M") || prompt_sub.equals("R") || prompt_sub.equals("r")));
                for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e+"\n");
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                }while(prompt_sub.equals("R") || prompt_sub.equals("r"));
            }
            //End of C7
            
            //C8
            else if(prompt_main.equals("C8") || prompt_main.equals("c8")){
                do{
                double pi=3.1416, r=0, vol=0;
                //Input confirmation
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                
                    }
                    System.out.print("(PROMPT)►►►Do you want to keep the default output of the program [Y], or not [N]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("Y") || prompt_sub.equals("y")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="1";
                        break;
                    }
                    else if(prompt_sub.equals("N") || prompt_sub.equals("n")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="0";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("Y") || prompt_sub.equals("y") || prompt_sub.equals("N") || prompt_sub.equals("n")));
                //End of Input confirmation
                
                //Default
                if(prompt_sub.equals("1")){
                    r=27.32; vol=(4*pi*r*r*r)/3;
                }
                //End of Default
                
                //Scanner
                else if(prompt_sub.equals("0")){ 
                    System.out.print("(PROMPT)►►►What is the radius of the circle? ");
                    r=main_scan.nextDouble();
                    vol=(4*pi*r*r*r)/3;
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                }
                //End of Scanner

                //Program header
                System.out.println();
                for(int q=1; q<=max_count; q++){
                    String w=("|| C8 - "+c_list[7]+" ||");
                    char e='_';
                        if((q==((max_count-w.length())/2)+1)){
                            System.out.print(w); q+=w.length()-1;
                        }
                        else{
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                }
                //End of Program header
                
                //Display output
                System.out.println();
                System.out.print("The volume of the sphere with a radius of "+r+" is "+vol+".");
                System.out.println();
                //End of Display output
                
                //Program footer
                for(int q=1; q<=max_count; q++){
                    char e='_';
                    if(q%max_count==0){
                        System.out.println(e);
                    }
                    else{
                        System.out.print(e);
                    }
                }
                System.out.println();
                //End of Program footer
                
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    System.out.print("(PROMPT)►►►Repeat the program [R], or go back to Main Menu [M]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("R") || prompt_sub.equals("r")){
                        prompt_sub="R";
                        break;
                    }
                    else if(prompt_sub.equals("M") || prompt_sub.equals("m")){
                        prompt_main="M";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("M") || prompt_sub.equals("M") || prompt_sub.equals("R") || prompt_sub.equals("r")));
                for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e+"\n");
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                }while(prompt_sub.equals("R") || prompt_sub.equals("r"));
            }
            //End of C8
            
            //C9
            else if(prompt_main.equals("C9") || prompt_main.equals("c9")){
                do{
                double fah=0, cel=0;
                //Input confirmation
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                
                    }
                    System.out.print("(PROMPT)►►►Do you want to keep the default output of the program [Y], or not [N]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("Y") || prompt_sub.equals("y")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="1";
                        break;
                    }
                    else if(prompt_sub.equals("N") || prompt_sub.equals("n")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="0";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("Y") || prompt_sub.equals("y") || prompt_sub.equals("N") || prompt_sub.equals("n")));
                //End of Input confirmation
                
                //Default
                if(prompt_sub.equals("1")){
                    cel=12.11; fah=((9*cel)/5)+32;
                }
                //End of Default
                
                //Scanner
                else if(prompt_sub.equals("0")){ 
                    System.out.print("(PROMPT)►►►What is the degree celsius to be converted? ");
                    cel=main_scan.nextDouble();
                    fah=((9*cel)/5)+32;
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                }
                //End of Scanner

                //Program header
                System.out.println();
                for(int q=1; q<=max_count; q++){
                    String w=("|| C9 - "+c_list[8]+" ||");
                    char e='_';
                        if((q==((max_count-w.length())/2)+1)){
                            System.out.print(w); q+=w.length()-1;
                        }
                        else{
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                }
                //End of Program header
                
                //Display output
                System.out.println();
                System.out.print(cel+" degree celsius is equal to "+fah+" degree fahrenheit.");
                System.out.println();
                //End of Display output
                
                //Program footer
                for(int q=1; q<=max_count; q++){
                    char e='_';
                    if(q%max_count==0){
                        System.out.println(e);
                    }
                    else{
                        System.out.print(e);
                    }
                }
                System.out.println();
                //End of Program footer
                
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    System.out.print("(PROMPT)►►►Repeat the program [R], or go back to Main Menu [M]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("R") || prompt_sub.equals("r")){
                        prompt_sub="R";
                        break;
                    }
                    else if(prompt_sub.equals("M") || prompt_sub.equals("m")){
                        prompt_main="M";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("M") || prompt_sub.equals("M") || prompt_sub.equals("R") || prompt_sub.equals("r")));
                for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e+"\n");
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                }while(prompt_sub.equals("R") || prompt_sub.equals("r"));
            }
            //End of C9
            
            //C10
            else if(prompt_main.equals("C10") || prompt_main.equals("c10")){
                do{
                double fah=0, cel=0;
                //Input confirmation
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                
                    }
                    System.out.print("(PROMPT)►►►Do you want to keep the default output of the program [Y], or not [N]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("Y") || prompt_sub.equals("y")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="1";
                        break;
                    }
                    else if(prompt_sub.equals("N") || prompt_sub.equals("n")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="0";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("Y") || prompt_sub.equals("y") || prompt_sub.equals("N") || prompt_sub.equals("n")));
                //End of Input confirmation
                
                //Default
                if(prompt_sub.equals("1")){
                    fah=98.34; cel=(((fah-32)*5)/9);
                }
                //End of Default
                
                //Scanner
                else if(prompt_sub.equals("0")){ 
                    System.out.print("(PROMPT)►►►What is the degree fahrenheit to be converted? ");
                    fah=main_scan.nextDouble();
                    cel=(((fah-32)*5)/9);
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                }
                //End of Scanner

                //Program header
                System.out.println();
                for(int q=1; q<=max_count; q++){
                    String w=("|| C10 - "+c_list[9]+" ||");
                    char e='_';
                        if((q==((max_count-w.length())/2)+1)){
                            System.out.print(w); q+=w.length()-1;
                        }
                        else{
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                }
                //End of Program header
                
                //Display output
                System.out.println();
                System.out.print(fah+" degree fahrenheit is equal to "+cel+" degree celsius.");
                System.out.println();
                //End of Display output
                
                //Program footer
                for(int q=1; q<=max_count; q++){
                    char e='_';
                    if(q%max_count==0){
                        System.out.println(e);
                    }
                    else{
                        System.out.print(e);
                    }
                }
                System.out.println();
                //End of Program footer
                
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    System.out.print("(PROMPT)►►►Repeat the program [R], or go back to Main Menu [M]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("R") || prompt_sub.equals("r")){
                        prompt_sub="R";
                        break;
                    }
                    else if(prompt_sub.equals("M") || prompt_sub.equals("m")){
                        prompt_main="M";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("M") || prompt_sub.equals("M") || prompt_sub.equals("R") || prompt_sub.equals("r")));
                for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e+"\n");
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                }while(prompt_sub.equals("R") || prompt_sub.equals("r"));
            }
            //End of C10
            
            //C11
            else if(prompt_main.equals("C11") || prompt_main.equals("c11")){
                do{
                double usd=0, php=0;
                //Input confirmation
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                
                    }
                    System.out.print("(PROMPT)►►►Do you want to keep the default output of the program [Y], or not [N]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("Y") || prompt_sub.equals("y")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="1";
                        break;
                    }
                    else if(prompt_sub.equals("N") || prompt_sub.equals("n")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="0";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("Y") || prompt_sub.equals("y") || prompt_sub.equals("N") || prompt_sub.equals("n")));
                //End of Input confirmation
                
                //Default
                if(prompt_sub.equals("1")){
                    usd=31.23; php=usd*52.40;
                }
                //End of Default
                
                //Scanner
                else if(prompt_sub.equals("0")){ 
                    System.out.print("(PROMPT)►►►What is the amount of money in US dollars? ");
                    usd=main_scan.nextDouble();
                    php=usd*52.40;
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                }
                //End of Scanner

                //Program header
                System.out.println();
                for(int q=1; q<=max_count; q++){
                    String w=("|| C11 - "+c_list[10]+" ||");
                    char e='_';
                        if((q==((max_count-w.length())/2)+1)){
                            System.out.print(w); q+=w.length()-1;
                        }
                        else{
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                }
                //End of Program header
                
                //Display output
                System.out.println();
                System.out.print("$"+usd+" is equal to ₱"+php+".");
                System.out.println();
                //End of Display output
                
                //Program footer
                for(int q=1; q<=max_count; q++){
                    char e='_';
                    if(q%max_count==0){
                        System.out.println(e);
                    }
                    else{
                        System.out.print(e);
                    }
                }
                System.out.println();
                //End of Program footer
                
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    System.out.print("(PROMPT)►►►Repeat the program [R], or go back to Main Menu [M]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("R") || prompt_sub.equals("r")){
                        prompt_sub="R";
                        break;
                    }
                    else if(prompt_sub.equals("M") || prompt_sub.equals("m")){
                        prompt_main="M";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("M") || prompt_sub.equals("M") || prompt_sub.equals("R") || prompt_sub.equals("r")));
                for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e+"\n");
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                }while(prompt_sub.equals("R") || prompt_sub.equals("r"));
            }
            //End of C11
            
            //C12
            else if(prompt_main.equals("C12") || prompt_main.equals("c12")){
                do{
                double usd=0, php=0;
                //Input confirmation
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                
                    }
                    System.out.print("(PROMPT)►►►Do you want to keep the default output of the program [Y], or not [N]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("Y") || prompt_sub.equals("y")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="1";
                        break;
                    }
                    else if(prompt_sub.equals("N") || prompt_sub.equals("n")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="0";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("Y") || prompt_sub.equals("y") || prompt_sub.equals("N") || prompt_sub.equals("n")));
                //End of Input confirmation
                
                //Default
                if(prompt_sub.equals("1")){
                    php=8657; usd=php*0.019;
                }
                //End of Default
                
                //Scanner
                else if(prompt_sub.equals("0")){ 
                    System.out.print("(PROMPT)►►►What is the amount of money in Philippine peso? ");
                    php=main_scan.nextDouble();
                    usd=php*0.019;
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                }
                //End of Scanner

                //Program header
                System.out.println();
                for(int q=1; q<=max_count; q++){
                    String w=("|| C12 - "+c_list[11]+" ||");
                    char e='_';
                        if((q==((max_count-w.length())/2)+1)){
                            System.out.print(w); q+=w.length()-1;
                        }
                        else{
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                }
                //End of Program header
                
                //Display output
                System.out.println();
                System.out.print("₱"+php+" is equal to $"+usd+".");
                System.out.println();
                //End of Display output
                
                //Program footer
                for(int q=1; q<=max_count; q++){
                    char e='_';
                    if(q%max_count==0){
                        System.out.println(e);
                    }
                    else{
                        System.out.print(e);
                    }
                }
                System.out.println();
                //End of Program footer
                
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    System.out.print("(PROMPT)►►►Repeat the program [R], or go back to Main Menu [M]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("R") || prompt_sub.equals("r")){
                        prompt_sub="R";
                        break;
                    }
                    else if(prompt_sub.equals("M") || prompt_sub.equals("m")){
                        prompt_main="M";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("M") || prompt_sub.equals("M") || prompt_sub.equals("R") || prompt_sub.equals("r")));
                for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e+"\n");
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                }while(prompt_sub.equals("R") || prompt_sub.equals("r"));
            }
            //End of C12
            
            //C13
            else if(prompt_main.equals("C13") || prompt_main.equals("c13")){
                do{
                double lbs=0, kg=0;
                //Input confirmation
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                
                    }
                    System.out.print("(PROMPT)►►►Do you want to keep the default output of the program [Y], or not [N]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("Y") || prompt_sub.equals("y")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="1";
                        break;
                    }
                    else if(prompt_sub.equals("N") || prompt_sub.equals("n")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="0";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("Y") || prompt_sub.equals("y") || prompt_sub.equals("N") || prompt_sub.equals("n")));
                //End of Input confirmation
                
                //Default
                if(prompt_sub.equals("1")){
                    lbs=120; kg=0.4536*lbs;
                }
                //End of Default
                
                //Scanner
                else if(prompt_sub.equals("0")){ 
                    System.out.print("(PROMPT)►►►What is the weight in pounds? ");
                    lbs=main_scan.nextDouble();
                    kg=0.4536*lbs;
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                }
                //End of Scanner

                //Program header
                System.out.println();
                for(int q=1; q<=max_count; q++){
                    String w=("|| C13 - "+c_list[12]+" ||");
                    char e='_';
                        if((q==((max_count-w.length())/2)+1)){
                            System.out.print(w); q+=w.length()-1;
                        }
                        else{
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                }
                //End of Program header
                
                //Display output
                System.out.println();
                System.out.print(lbs+" pound(s) is equal to "+kg+" kilogram(s).");
                System.out.println();
                //End of Display output
                
                //Program footer
                for(int q=1; q<=max_count; q++){
                    char e='_';
                    if(q%max_count==0){
                        System.out.println(e);
                    }
                    else{
                        System.out.print(e);
                    }
                }
                System.out.println();
                //End of Program footer
                
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    System.out.print("(PROMPT)►►►Repeat the program [R], or go back to Main Menu [M]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("R") || prompt_sub.equals("r")){
                        prompt_sub="R";
                        break;
                    }
                    else if(prompt_sub.equals("M") || prompt_sub.equals("m")){
                        prompt_main="M";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("M") || prompt_sub.equals("M") || prompt_sub.equals("R") || prompt_sub.equals("r")));
                for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e+"\n");
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                }while(prompt_sub.equals("R") || prompt_sub.equals("r"));
            }
            //End of C13
            
            //C14
            else if(prompt_main.equals("C14") || prompt_main.equals("c14")){
                do{
                double lbs=0, kg=0;
                //Input confirmation
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                
                    }
                    System.out.print("(PROMPT)►►►Do you want to keep the default output of the program [Y], or not [N]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("Y") || prompt_sub.equals("y")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="1";
                        break;
                    }
                    else if(prompt_sub.equals("N") || prompt_sub.equals("n")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="0";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("Y") || prompt_sub.equals("y") || prompt_sub.equals("N") || prompt_sub.equals("n")));
                //End of Input confirmation
                
                //Default
                if(prompt_sub.equals("1")){
                    kg=85.25; lbs=2.2046*kg;
                }
                //End of Default
                
                //Scanner
                else if(prompt_sub.equals("0")){ 
                    System.out.print("(PROMPT)►►►What is the weight in pounds? ");
                    kg=main_scan.nextDouble();
                    lbs=2.2046*kg;
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                }
                //End of Scanner

                //Program header
                System.out.println();
                for(int q=1; q<=max_count; q++){
                    String w=("|| C14 - "+c_list[13]+" ||");
                    char e='_';
                        if((q==((max_count-w.length())/2)+1)){
                            System.out.print(w); q+=w.length()-1;
                        }
                        else{
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                }
                //End of Program header
                
                //Display output
                System.out.println();
                System.out.print(kg+" kilogram(s) is equal to "+lbs+" pound(s).");
                System.out.println();
                //End of Display output
                
                //Program footer
                for(int q=1; q<=max_count; q++){
                    char e='_';
                    if(q%max_count==0){
                        System.out.println(e);
                    }
                    else{
                        System.out.print(e);
                    }
                }
                System.out.println();
                //End of Program footer
                
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    System.out.print("(PROMPT)►►►Repeat the program [R], or go back to Main Menu [M]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("R") || prompt_sub.equals("r")){
                        prompt_sub="R";
                        break;
                    }
                    else if(prompt_sub.equals("M") || prompt_sub.equals("m")){
                        prompt_main="M";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("M") || prompt_sub.equals("M") || prompt_sub.equals("R") || prompt_sub.equals("r")));
                for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e+"\n");
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                }while(prompt_sub.equals("R") || prompt_sub.equals("r"));
            }
            //End of C14
            
            //D1
            else if(prompt_main.equals("D1") || prompt_main.equals("d1")){
                do{
                int n1=0, n2=0;
                //Input confirmation
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                
                    }
                    System.out.print("(PROMPT)►►►Do you want to keep the default output of the program [Y], or not [N]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("Y") || prompt_sub.equals("y")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="1";
                        break;
                    }
                    else if(prompt_sub.equals("N") || prompt_sub.equals("n")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="0";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("Y") || prompt_sub.equals("y") || prompt_sub.equals("N") || prompt_sub.equals("n")));
                //End of Input confirmation
                
                //Default
                if(prompt_sub.equals("1")){
                    n1=3285; n2=413;
                }
                //End of Default
                
                //Scanner
                else if(prompt_sub.equals("0")){ 
                    System.out.print("(PROMPT)►►►What is the first number? ");
                    n1=main_scan.nextInt();
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    System.out.print("(PROMPT)►►►What is the second number? ");
                    n2=main_scan.nextInt();
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                }
                //End of Scanner

                //Program header
                System.out.println();
                for(int q=1; q<=max_count; q++){
                    String w=("|| D1 - "+d_list[0]+" ||");
                    char e='_';
                        if((q==((max_count-w.length())/2)+1)){
                            System.out.print(w); q+=w.length()-1;
                        }
                        else{
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                }
                //End of Program header
                
                //Display output
                System.out.println();
                if(n1>n2){
                    System.out.print(n1+", the first number, is greater than "+n2+", the second number.");
                }
                else if(n2>n1){
                    System.out.print(n2+", the second number, is greater than "+n1+", the first number.");
                }
                else{
                    System.out.print("There is no greater among "+n1+", the first number and "+n2+", the second number.");
                }
                System.out.println();
                //End of Display output
                
                //Program footer
                for(int q=1; q<=max_count; q++){
                    char e='_';
                    if(q%max_count==0){
                        System.out.println(e);
                    }
                    else{
                        System.out.print(e);
                    }
                }
                System.out.println();
                //End of Program footer
                
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    System.out.print("(PROMPT)►►►Repeat the program [R], or go back to Main Menu [M]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("R") || prompt_sub.equals("r")){
                        prompt_sub="R";
                        break;
                    }
                    else if(prompt_sub.equals("M") || prompt_sub.equals("m")){
                        prompt_main="M";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("M") || prompt_sub.equals("M") || prompt_sub.equals("R") || prompt_sub.equals("r")));
                for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e+"\n");
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                }while(prompt_sub.equals("R") || prompt_sub.equals("r"));
            }  
            //End of D1
            
            //D2
            else if(prompt_main.equals("D2") || prompt_main.equals("d2")){
                do{
                int n=0;
                //Input confirmation
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                
                    }
                    System.out.print("(PROMPT)►►►Do you want to keep the default output of the program [Y], or not [N]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("Y") || prompt_sub.equals("y")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="1";
                        break;
                    }
                    else if(prompt_sub.equals("N") || prompt_sub.equals("n")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="0";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("Y") || prompt_sub.equals("y") || prompt_sub.equals("N") || prompt_sub.equals("n")));
                //End of Input confirmation
                
                //Default
                if(prompt_sub.equals("1")){
                    n=23123;
                }
                //End of Default
                
                //Scanner
                else if(prompt_sub.equals("0")){ 
                    System.out.print("(PROMPT)►►►What is the number? ");
                    n=main_scan.nextInt();
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                }
                //End of Scanner

                //Program header
                System.out.println();
                for(int q=1; q<=max_count; q++){
                    String w=("|| D2 - "+d_list[1]+" ||");
                    char e='_';
                        if((q==((max_count-w.length())/2)+1)){
                            System.out.print(w); q+=w.length()-1;
                        }
                        else{
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                }
                //End of Program header
                
                //Display output
                System.out.println();
                if(n%2==0){
                    System.out.print(n+" is an even number.");
                }
                else{
                    System.out.print(n+" is an odd number.");
                }
                System.out.println();
                //End of Display output
                
                //Program footer
                for(int q=1; q<=max_count; q++){
                    char e='_';
                    if(q%max_count==0){
                        System.out.println(e);
                    }
                    else{
                        System.out.print(e);
                    }
                }
                System.out.println();
                //End of Program footer
                
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    System.out.print("(PROMPT)►►►Repeat the program [R], or go back to Main Menu [M]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("R") || prompt_sub.equals("r")){
                        prompt_sub="R";
                        break;
                    }
                    else if(prompt_sub.equals("M") || prompt_sub.equals("m")){
                        prompt_main="M";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("M") || prompt_sub.equals("M") || prompt_sub.equals("R") || prompt_sub.equals("r")));
                for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e+"\n");
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                }while(prompt_sub.equals("R") || prompt_sub.equals("r"));
            }
            //End of D2
            
            //D3
            else if(prompt_main.equals("D3") || prompt_main.equals("d3")){
                do{
                double we=0, he=0, bmi=0;
                //Input confirmation
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    System.out.print("(PROMPT)►►►Do you want to keep the default output of the program [Y], or not [N]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("Y") || prompt_sub.equals("y")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="1";
                        break;
                    }
                    else if(prompt_sub.equals("N") || prompt_sub.equals("n")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="0";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("Y") || prompt_sub.equals("y") || prompt_sub.equals("N") || prompt_sub.equals("n")));
                //End of Input confirmation
                
                //Default
                if(prompt_sub.equals("1")){
                    we=60; he=1.61; bmi=we/(he*he);
                }
                //End of Default
                
                //Scanner
                else if(prompt_sub.equals("0")){ 
                    System.out.print("(PROMPT)►►►What is the weight (In kilograms)? ");
                    we=main_scan.nextInt();
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    System.out.print("(PROMPT)►►►What is the height (In meters)? ");
                    he=main_scan.nextInt();
                    bmi=we/(he*he);
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                }
                //End of Scanner

                //Program header
                System.out.println();
                for(int q=1; q<=max_count; q++){
                    String w=("|| D3 - "+d_list[2]+" ||");
                    char e='_';
                        if((q==((max_count-w.length())/2)+1)){
                            System.out.print(w); q+=w.length()-1;
                        }
                        else{
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                }
                //End of Program header
                
                //Display output
                System.out.println();
                if(bmi<18.50){
                    System.out.print(+we+" kilogram(s) weight and "+he+" meter(s) height, has a BMI of "+bmi+" - Underweight.");
                }
                else if(bmi>=18.50&&bmi<=24.90){
                    System.out.print(we+" kilogram(s) weight and "+he+" meter(s) height, has a BMI of "+bmi+" - Normal Weight.");
                }
                else if(bmi>24.90&&bmi<=29.90){
                    System.out.print(we+" kilogram(s) weight and "+he+" meter(s) height, has a BMI of "+bmi+" - Overweight.");
                }
                else if(bmi>29.90){
                    System.out.print(we+" kilogram(s) weight and "+he+" meter(s) height, has a BMI of "+bmi+" - Obese.");
                }
                System.out.println();
                //End of Display output
                
                //Program footer
                for(int q=1; q<=max_count; q++){
                    char e='_';
                    if(q%max_count==0){
                        System.out.println(e);
                    }
                    else{
                        System.out.print(e);
                    }
                }
                System.out.println();
                //End of Program footer
                
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    System.out.print("(PROMPT)►►►Repeat the program [R], or go back to Main Menu [M]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("R") || prompt_sub.equals("r")){
                        prompt_sub="R";
                        break;
                    }
                    else if(prompt_sub.equals("M") || prompt_sub.equals("m")){
                        prompt_main="M";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("M") || prompt_sub.equals("M") || prompt_sub.equals("R") || prompt_sub.equals("r")));
                for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e+"\n");
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                }while(prompt_sub.equals("R") || prompt_sub.equals("r"));
            }
            //End of D3
            
            //D4
            else if(prompt_main.equals("D4") || prompt_main.equals("d4")){
                do{double grade=0;
                //Input confirmation
                do{for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}
                    }System.out.print("(PROMPT)►►►Do you want to keep the default output of the program [Y], or not [N]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("Y") || prompt_sub.equals("y")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="1";
                        break;
                    }
                    else if(prompt_sub.equals("N") || prompt_sub.equals("n")){
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        prompt_sub="0";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("Y") || prompt_sub.equals("y") || prompt_sub.equals("N") || prompt_sub.equals("n")));
                //End of Input confirmation
                
                //Default
                if(prompt_sub.equals("1")){
                    grade=92;
                }
                //End of Default
                
                //Scanner
                else if(prompt_sub.equals("0")){do{ 
                    System.out.print("(PROMPT)►►►What is the grade (Maximum of 100)? ");
                    grade=main_scan.nextDouble();
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    if(grade>100){System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells."); for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);
                        }}}}while(grade>100);
                }
                //End of Scanner
                //Program header
                System.out.println();
                for(int q=1; q<=max_count; q++){
                    String w=("|| D4 - "+d_list[3]+" ||");
                    char e='_';
                        if((q==((max_count-w.length())/2)+1)){
                            System.out.print(w); q+=w.length()-1;
                        }
                        else{
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                }
                //End of Program header
                
                //Display output
                System.out.println();
                if(grade<=74){System.out.print("The grade "+grade+" is in the Beginning Level.");} else if(grade>74&&grade<=79){System.out.print("The grade "+grade+" is in the Developing Level.");} else if(grade>79&&grade<=84){System.out.print("The grade "+grade+" is in the Approaching Proficiency Level.");} else if(grade>84&&grade<=89){System.out.print("The grade "+grade+" is in the Proficient Level.");} else if(grade>89){System.out.print("The grade "+grade+" is in the Advanced Level.");}
                System.out.println();
                //End of Display output
                
                //Program footer
                for(int q=1; q<=max_count; q++){
                    char e='_';
                    if(q%max_count==0){
                        System.out.println(e);
                    }
                    else{
                        System.out.print(e);
                    }
                }
                System.out.println();
                //End of Program footer
                
                do{
                    for(int q=1; q<=max_count; q++){
                        char e='.';
                        if(q%max_count==0){
                            System.out.println(e);
                        }
                        else{
                            System.out.print(e);
                        }
                    }
                    System.out.print("(PROMPT)►►►Repeat the program [R], or go back to Main Menu [M]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("R") || prompt_sub.equals("r")){
                        prompt_sub="R";
                        break;
                    }
                    else if(prompt_sub.equals("M") || prompt_sub.equals("m")){
                        prompt_main="M";
                        break;
                    }
                    else{for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}}System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("M") || prompt_sub.equals("M") || prompt_sub.equals("R") || prompt_sub.equals("r")));for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e+"\n");}else{System.out.print(e);}}}while(prompt_sub.equals("R") || prompt_sub.equals("r"));}
            //End of D4
            
            //D5
            else if(prompt_main.equals("D5") || prompt_main.equals("d5")){
                do{String[] zod={"Monkey","Rooster","Dog","Pig","Rat","Ox","Tiger","Rabbit","Dragon","Snake","Horse","Goat"}; int year=0, cnt=0;
                //Input confirmation
                do{for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}
                    }System.out.print("(PROMPT)►►►Do you want to keep the default output of the program [Y], or not [N]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("Y") || prompt_sub.equals("y")){
                        for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}
                        }
                        prompt_sub="1";
                        break;
                    }
                    else if(prompt_sub.equals("N") || prompt_sub.equals("n")){
                        for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}}
                        prompt_sub="0";
                        break;
                    }
                    else{
                        for(int q=1; q<=max_count; q++){
                            char e='.';
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("Y") || prompt_sub.equals("y") || prompt_sub.equals("N") || prompt_sub.equals("n")));
                //End of Input confirmation
                
                //Default
                if(prompt_sub.equals("1")){
                    year=1999; cnt=year%12;
                }
                //End of Default
                
                //Scanner
                else if(prompt_sub.equals("0")){ 
                    System.out.print("(PROMPT)►►►What is the year? ");
                    year=main_scan.nextInt(); cnt=year%12;
                    for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}
                    }
                }
                //End of Scanner
                //Program header
                System.out.println();
                for(int q=1; q<=max_count; q++){
                    String w=("|| D5 - "+d_list[4]+" ||");
                    char e='_';
                        if((q==((max_count-w.length())/2)+1)){
                            System.out.print(w); q+=w.length()-1;
                        }
                        else{
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                }
                //End of Program header
                
                //Display output
                System.out.println();
                System.out.print("The year "+year+" is in the year of the "+zod[cnt]+".");
                System.out.println();
                //End of Display output
                //Program footer
                for(int q=1; q<=max_count; q++){char e='_';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}}System.out.println();
                //End of Program footer
                do{for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}}
                    System.out.print("(PROMPT)►►►Repeat the program [R], or go back to Main Menu [M]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("R") || prompt_sub.equals("r")){
                        prompt_sub="R";
                        break;
                    }
                    else if(prompt_sub.equals("M") || prompt_sub.equals("m")){
                        prompt_main="M";
                        break;
                    }
                    else{for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}}System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("M") || prompt_sub.equals("M") || prompt_sub.equals("R") || prompt_sub.equals("r")));for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e+"\n");}else{System.out.print(e);}}}while(prompt_sub.equals("R") || prompt_sub.equals("r"));}
            //End of D5
            
            //D6
            else if(prompt_main.equals("D6") || prompt_main.equals("d6")){
                do{int num=0;
                //Input confirmation
                do{for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}
                    }System.out.print("(PROMPT)►►►Do you want to keep the default output of the program [Y], or not [N]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("Y") || prompt_sub.equals("y")){
                        for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}
                        }
                        prompt_sub="1";
                        break;
                    }
                    else if(prompt_sub.equals("N") || prompt_sub.equals("n")){
                        for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}}
                        prompt_sub="0";
                        break;
                    }
                    else{for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}}
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("Y") || prompt_sub.equals("y") || prompt_sub.equals("N") || prompt_sub.equals("n")));
                //End of Input confirmation
                
                //Default
                if(prompt_sub.equals("1")){
                    num=123;
                }
                //End of Default
                
                //Scanner
                else if(prompt_sub.equals("0")){ 
                    System.out.print("(PROMPT)►►►What is the number? ");
                    num=main_scan.nextInt();
                    for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}
                    }
                }
                //End of Scanner
                //Program header
                System.out.println();
                for(int q=1; q<=max_count; q++){
                    String w=("|| D6 - "+d_list[5]+" ||");
                    char e='_';
                        if((q==((max_count-w.length())/2)+1)){
                            System.out.print(w); q+=w.length()-1;
                        }
                        else{
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                }
                //End of Program header
                
                //Display output
                System.out.println();
                if(num%2==0){System.out.print("The number "+num+" is divisible by two.");}else if(num%5==0){System.out.print("The number "+num+" is divisible by five.");}else{System.out.print("The number "+num+" is not divisible by two nor five.");}
                System.out.println();
                //End of Display output
                //Program footer
                for(int q=1; q<=max_count; q++){char e='_';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}}System.out.println();
                //End of Program footer
                do{for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}}
                    System.out.print("(PROMPT)►►►Repeat the program [R], or go back to Main Menu [M]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("R") || prompt_sub.equals("r")){
                        prompt_sub="R";
                        break;
                    }
                    else if(prompt_sub.equals("M") || prompt_sub.equals("m")){
                        prompt_main="M";
                        break;
                    }
                    else{for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}}System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("M") || prompt_sub.equals("M") || prompt_sub.equals("R") || prompt_sub.equals("r")));for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e+"\n");}else{System.out.print(e);}}}while(prompt_sub.equals("R") || prompt_sub.equals("r"));}
            //End of D6
            
            //E1
            else if(prompt_main.equals("E1") || prompt_main.equals("e1")){
                do{int row=0, table=0;
                //Input confirmation
                do{for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}
                    }System.out.print("(PROMPT)►►►Do you want to keep the default output of the program [Y], or not [N]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("Y") || prompt_sub.equals("y")){
                        for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}
                        }
                        prompt_sub="1";
                        break;
                    }
                    else if(prompt_sub.equals("N") || prompt_sub.equals("n")){
                        for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}}
                        prompt_sub="0";
                        break;
                    }
                    else{for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}}
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("Y") || prompt_sub.equals("y") || prompt_sub.equals("N") || prompt_sub.equals("n")));
                //End of Input confirmation
                
                //Default
                if(prompt_sub.equals("1")){
                    table=10; row=12;
                }
                //End of Default
                
                //Scanner
                else if(prompt_sub.equals("0")){ 
                    System.out.print("(PROMPT)►►►What multiplication table number do you want to see? ");
                    table=main_scan.nextInt();
                    for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}
                    }
                    System.out.print("(PROMPT)►►►How many rows do you want for the table? ");
                    row=main_scan.nextInt();
                    for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}
                    }
                }
                //End of Scanner
                //Program header
                System.out.println();
                for(int q=1; q<=max_count; q++){
                    String w=("|| E1 - "+e_list[0]+" ||");
                    char e='_';
                        if((q==((max_count-w.length())/2)+1)){
                            System.out.print(w); q+=w.length()-1;
                        }
                        else{
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                }
                //End of Program header
                
                //Display output
                System.out.println();
                for(int q=1; q<=row; q++){if(q==row){System.out.print(table+" x "+q+" = "+table*q);}else {System.out.println(table+" x "+q+" = "+table*q);}}
                System.out.println();
                //End of Display output
                //Program footer
                for(int q=1; q<=max_count; q++){char e='_';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}}System.out.println();
                //End of Program footer
                do{for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}}
                    System.out.print("(PROMPT)►►►Repeat the program [R], or go back to Main Menu [M]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("R") || prompt_sub.equals("r")){
                        prompt_sub="R";
                        break;
                    }
                    else if(prompt_sub.equals("M") || prompt_sub.equals("m")){
                        prompt_main="M";
                        break;
                    }
                    else{for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}}System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("M") || prompt_sub.equals("M") || prompt_sub.equals("R") || prompt_sub.equals("r")));for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e+"\n");}else{System.out.print(e);}}}while(prompt_sub.equals("R") || prompt_sub.equals("r"));}
            //End of E1
            
            //E2
            else if(prompt_main.equals("E2") || prompt_main.equals("e2")){
                do{int num=0, sum=0, list=0;
                //Input confirmation
                do{for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}
                    }System.out.print("(PROMPT)►►►Do you want to keep the default output of the program [Y], or not [N]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("Y") || prompt_sub.equals("y")){
                        for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}
                        }
                        prompt_sub="1";
                        break;
                    }
                    else if(prompt_sub.equals("N") || prompt_sub.equals("n")){
                        for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}}
                        prompt_sub="0";
                        break;
                    }
                    else{for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}}
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("Y") || prompt_sub.equals("y") || prompt_sub.equals("N") || prompt_sub.equals("n")));
                //End of Input confirmation
                
                //Default
                if(prompt_sub.equals("1")){
                    num=25; list=8;
                }
                //End of Default
                
                //Scanner
                else if(prompt_sub.equals("0")){ 
                    System.out.print("(PROMPT)►►►How many consecutive numbers do you want to add? ");
                    list=main_scan.nextInt();
                    for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}
                    }
                    System.out.print("(PROMPT)►►►What is the initial number of the consecutive numbers? ");
                    num=main_scan.nextInt();
                    for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}
                    }
                }
                //End of Scanner
                //Program header
                System.out.println();
                for(int q=1; q<=max_count; q++){
                    String w=("|| E2 - "+e_list[1]+" ||");
                    char e='_';
                        if((q==((max_count-w.length())/2)+1)){
                            System.out.print(w); q+=w.length()-1;
                        }
                        else{
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                }
                //End of Program header
                
                //Display output
                System.out.println();
                for(int q=1; q<=list; q++){if(q==list){System.out.print(num+" = ");}else{System.out.print(num+" + ");}sum+=num; num++;}
                System.out.print(sum);
                System.out.println();
                //End of Display output
                //Program footer
                for(int q=1; q<=max_count; q++){char e='_';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}}System.out.println();
                //End of Program footer
                do{for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}}
                    System.out.print("(PROMPT)►►►Repeat the program [R], or go back to Main Menu [M]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("R") || prompt_sub.equals("r")){
                        prompt_sub="R";
                        break;
                    }
                    else if(prompt_sub.equals("M") || prompt_sub.equals("m")){
                        prompt_main="M";
                        break;
                    }
                    else{for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}}System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("M") || prompt_sub.equals("M") || prompt_sub.equals("R") || prompt_sub.equals("r")));for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e+"\n");}else{System.out.print(e);}}}while(prompt_sub.equals("R") || prompt_sub.equals("r"));}
            //End of E2
            
            //E3
            else if(prompt_main.equals("E3") || prompt_main.equals("e3")){
                do{int num=0; String txt="";
                //Input confirmation
                do{for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}
                    }System.out.print("(PROMPT)►►►Do you want to keep the default output of the program [Y], or not [N]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("Y") || prompt_sub.equals("y")){
                        for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}
                        }
                        prompt_sub="1";
                        break;
                    }
                    else if(prompt_sub.equals("N") || prompt_sub.equals("n")){
                        for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}}
                        prompt_sub="0";
                        break;
                    }
                    else{for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}}
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("Y") || prompt_sub.equals("y") || prompt_sub.equals("N") || prompt_sub.equals("n")));
                //End of Input confirmation
                
                //Default
                if(prompt_sub.equals("1")){
                    num=10; txt="Hello World!";
                }
                //End of Default
                
                //Scanner
                else if(prompt_sub.equals("0")){ 
                    System.out.print("(PROMPT)►►►What is the text to be displayed? ");
                    txt=main_scan.next();
                    for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}
                    }
                    System.out.print("(PROMPT)►►►How many time(s) do you want it to repeat? ");
                    num=main_scan.nextInt();
                    for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}
                    }
                }
                //End of Scanner
                //Program header
                System.out.println();
                for(int q=1; q<=max_count; q++){
                    String w=("|| E3 - "+e_list[2]+" ||"); String w1=("|| E2 - Display \""+txt+"\" "+num+" times Program ||");
                    char e='_';
                    if(prompt_sub.equals("1")){
                        if((q==((max_count-w.length())/2)+1)){
                            System.out.print(w); q+=w.length()-1;
                        }
                        else{
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                    }
                    else if(prompt_sub.equals("0")){
                        if((q==((max_count-w1.length())/2)+1)){
                            System.out.print(w1); q+=w1.length()-1;
                        }
                        else{
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                    }
                }
                //End of Program header
                
                //Display output
                System.out.println();
                for(int q=1; q<=num; q++){if(q==num){System.out.print(txt);}else{System.out.println(txt);}}
                System.out.println();
                //End of Display output
                //Program footer
                for(int q=1; q<=max_count; q++){char e='_';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}}System.out.println();
                //End of Program footer
                do{for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}}
                    System.out.print("(PROMPT)►►►Repeat the program [R], or go back to Main Menu [M]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("R") || prompt_sub.equals("r")){
                        prompt_sub="R";
                        break;
                    }
                    else if(prompt_sub.equals("M") || prompt_sub.equals("m")){
                        prompt_main="M";
                        break;
                    }
                    else{for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}}System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("M") || prompt_sub.equals("M") || prompt_sub.equals("R") || prompt_sub.equals("r")));for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e+"\n");}else{System.out.print(e);}}}while(prompt_sub.equals("R") || prompt_sub.equals("r"));}
            //End of E3
            
            //E4
            else if(prompt_main.equals("E4") || prompt_main.equals("e4")){
                do{String txt="";
                //Input confirmation
                do{for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}
                    }System.out.print("(PROMPT)►►►Do you want to keep the default output of the program [Y], or not [N]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("Y") || prompt_sub.equals("y")){
                        for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}
                        }
                        prompt_sub="1";
                        break;
                    }
                    else if(prompt_sub.equals("N") || prompt_sub.equals("n")){
                        for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}}
                        prompt_sub="0";
                        break;
                    }
                    else{for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}}
                        System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("Y") || prompt_sub.equals("y") || prompt_sub.equals("N") || prompt_sub.equals("n")));
                //End of Input confirmation
                
                //Default
                if(prompt_sub.equals("1")){
                    txt="@";
                }
                //End of Default
                
                //Scanner
                else if(prompt_sub.equals("0")){ 
                    System.out.print("(PROMPT)►►►What character(s) will build up the arrow? ");
                    txt=main_scan.next();
                    for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}
                    }
                }
                //End of Scanner
                //Program header
                System.out.println();
                for(int q=1; q<=max_count; q++){
                    String w=("|| E4 - "+e_list[3]+" ||");
                    char e='_';
                        if((q==((max_count-w.length())/2)+1)){
                            System.out.print(w); q+=w.length()-1;
                        }
                        else{
                            if(q%max_count==0){
                                System.out.println(e);
                            }
                            else{
                                System.out.print(e);
                            }
                        }
                }
                //End of Program header
                
                //Display output
                System.out.println();
                for(int q=1; q<=10; q++){
                    System.out.print(txt);
                    for(int w=2; w<=q; w++){
                        System.out.print(txt);
                    }
                    System.out.println();
                }
                for(int q=9; q>=1; q--){
                    System.out.print(txt);
                    for(int w=1; w<q; w++){
                        System.out.print(txt);
                    }
                    if(q==1){}else{ System.out.println();}
                }
                System.out.println();
                //End of Display output
                //Program footer
                for(int q=1; q<=max_count; q++){char e='_';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}}System.out.println();
                //End of Program footer
                do{for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}}
                    System.out.print("(PROMPT)►►►Repeat the program [R], or go back to Main Menu [M]: ");
                    prompt_sub=main_scan.next();
                    if(prompt_sub.equals("R") || prompt_sub.equals("r")){
                        prompt_sub="R";
                        break;
                    }
                    else if(prompt_sub.equals("M") || prompt_sub.equals("m")){
                        prompt_main="M";
                        break;
                    }
                    else{for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e);}else{System.out.print(e);}}System.out.println("(ERROR)►►►Invalide choice. Make sure to follow what the prompt tells.");
                    }
                }while(!(prompt_sub.equals("M") || prompt_sub.equals("M") || prompt_sub.equals("R") || prompt_sub.equals("r")));for(int q=1; q<=max_count; q++){char e='.';if(q%max_count==0){System.out.println(e+"\n");}else{System.out.print(e);}}}while(prompt_sub.equals("R") || prompt_sub.equals("r"));}
            //End of E4
        }while((!(prompt_main.equals("X") || prompt_main.equals("x"))) || (prompt_main.equals("M") || (prompt_main.equals("M"))));
        //End of Main Loop
    }
}