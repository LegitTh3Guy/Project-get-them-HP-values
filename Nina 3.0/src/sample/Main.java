package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.*;

public class Main extends Application{
    private ComboBox<String> classList, anList,timeWatched;
    Stage window;
    private  VBox OleftMenu;
    private Scene scene1,scene2,scene3;
    int i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16,i17,i18,i19,i20,i21,i22,i23,i24;
    int t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24;
    private BorderPane Obsv,Data1 ;
    private Button button10,button11,button12,button13,button14,button15,button16,button17,button18,button19,button20,button21,button22,button23,button24;
    private Button button1, button2,buttonB1,buttonC,buttonB2,buttonHP,button3,button4,button5,button6,button7,button8,button9;
    double t,m,b,HP;// m = Modification  b = Class Base   HP = the health
    int u=1; //u = user level
    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Calculate your pet's HP!");

        window.setOnCloseRequest(e->{
            e.consume();
            closeProgram();
        });

        //Time watched
        timeWatched = new ComboBox<>();
        timeWatched.getItems().addAll("How may hours did you watch your pet?",".5","1","1.5","2");
        timeWatched.setValue("How may hours did you watch your pet?");
        timeWatched.setOnAction(e-> {
            String Time = timeWatched.getValue();
            switch (Time) {
                case ".5":
                    t=0.5;
                    break;
                case "1":
                    t=1;
                    break;
                case "1.5":
                    t=1.5;
                    break;
                case "2":
                    t=2;
                    break;
                }});
        //Welcome Scene
        Label welcomeMSG = new Label("Welcome to Calculate your Pet's HP program!");
        Button buttonW = new Button("Start!");

        //The Back Button (From scene 2 to 1)
        buttonB1 = new Button("Back");
        buttonB1.setOnAction(e -> window.setScene(scene1));

        //Close Button
        buttonC = new Button("Close");
        buttonC.setOnAction(e-> closeProgram());

        //Welcome Page SCENE 1
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(welcomeMSG,buttonW);
        scene1 = new Scene(layout1,200,200);

        //Clear All Button
        Button ClearAllButton = new Button("Clear All");

        //Buttons for General behavior
        button1 = new Button("Eating Normal Food");
        button2= new Button("Hunting");
        button3 = new Button("Scavenging");
        button4 = new Button("Song");
        button5 = new Button("Alarm Call");
        button6 = new Button("Funny Vocalization");
        button7 = new Button("Preening");
        button8 = new Button("Bathing");
        button9 = new Button("Social Grooming");

        button1.setOnAction(e-> {
            i1++;
            t1 = i1;
        });
        button2.setOnAction(e-> {
            i2++;
            t2 = i2*2;
        });
        button3.setOnAction(e-> {
            i3++;
            t3 = i3*2;
        });
        button4.setOnAction(e-> {
            i4++;
            t4 = i4;
        });
        button5.setOnAction(e-> {
            i5++;
            t5 = i5;
        });
        button6.setOnAction(e-> {
            i6++;
            t6 = i6*2;
        });
        button7.setOnAction(e-> {
            i7++;
            t7 = i7;
        });
        button8.setOnAction(e-> {
            i8++;
            t8 = i8;
        });
        button9.setOnAction(e-> {
            i9++;
            t9 = i9*2;

        });
        //Class Specific Behavior Buttons
        button10 = new Button("Mischievous action");
        button11 = new Button("Stealing Something");
        button12 = new Button("Sunrises you ");
        button13 = new Button("Soothing action");
        button14 = new Button("Gentle touch");
        button15 = new Button("Appearing in your hour of need");
        button16 = new Button("Loyal action");
        button17 = new Button("Doing good deeds");
        button18 = new Button("Bringing you something you didn't ask for");
        button19 = new Button("Clever action");
        button20 = new Button("Gazing Contemplatively");
        button21 = new Button("Ignoring you completely");
        button22 = new Button("Impolite action");
        button23 = new Button("Courageous feat");
        button24 = new Button("Not caring about smart stuff");


        button10.setOnAction(e-> {
            i10++;
            i10 = i10*3;
        });
        button11.setOnAction(e-> {
            i11++;
            i11 = i11*4;
        });
        button12.setOnAction(e-> {
            i12++;
            i12 = i12*5;
        });
        button13.setOnAction(e-> {
            i13++;
            i13 = i13*5;
        });
        button14.setOnAction(e-> {
            i14++;
            i14 = i14*4;
        });
        button15.setOnAction(e-> {
            i15++;
            i15 = i15*5;
        });
        button10.setOnAction(e-> {
            i16++;
            i16 = i16*3;
        });
        button17.setOnAction(e-> {
            i17++;
            i17 = i17*4;
        });
        button18.setOnAction(e-> {
            i18++;
            i18 = i18*5;
        });
        button19.setOnAction(e-> {
            i19++;
            i19 = i19*3;
        });
        button20.setOnAction(e-> {
            i20++;
            i20 = i20*4;
        });
        button21.setOnAction(e-> {
            i21++;
            i21 = i21*5;
        });
        button22.setOnAction(e-> {
            i22++;
            i22 = i22*3;
        });
        button23.setOnAction(e-> {
            i23++;
            i23 = i23*4;
        });
        button24.setOnAction(e-> {
            i24++;
            i24 = i24*5;
        });






        //Drop Down menu for animals
        anList = new ComboBox<>();
        anList.getItems().addAll("Select Your Pet","Dog","Cat", "Fish","Reptile", "Bird", "Equine", "Small Mammal", "Bug", "Amphibian");
        anList.setValue("Select Your Pet");
        anList.setOnAction(e-> {
           String Animal = anList.getValue();
            switch (Animal) {
                case "Dog":
                    m = 2.4;
                    break;
                case "Cat":
                    m = 2;
                    break;
                case "Fish":
                    m = 3.1;
                    break;
                case "Reptile":
                    m = 2.8;
                    break;
                case "Bird":
                    m = 2.3;
                    break;
                case "Equine":
                    m = 2.4;
                    break;
                case "Small Mammal":
                    m = 2.4;
                    break;
                case "Bug":
                    m = 2.3;
                    break;
                case "Amphibian":
                    m = 2.2;
                    break;
            }
        });



        //The Back Button (From scene 3 to 2)
        buttonB2= new Button("Back");


        //SCENE 3
        Obsv = initObservation();
        scene3 = new Scene(Obsv,300,400);
        buttonB1.setOnAction(e -> window.setScene(scene3));

        //Dropdown for Class
        classList = initClassList();



        //Calculate Button/Pop up pet's HP
        buttonHP = new Button("Calculate!");
        buttonHP.setOnAction(e-> {
            u = i1 +i2+ i3+ i4+ i5+ i6+ i7+ i8+ i9 + i10+ i11+ i12+ i13+ i12+ i13+ i14+ i15+ i16+ i15+ i14+ i13+ i14+ i15+ i16+ i17+ i18+ i19+ i20+ i21+ i22+ i23+ i24;
            HP = b + (u*m);

            AlertBox.display("Your Pet's Hit Points!", "Level: "+ u + "    HP: "+ HP);
        });

        //Scene 2 to 3
        Button buttonN = new Button("Next");

        //Top Menu
        HBox topMenu = new HBox();
        topMenu.getChildren().addAll(timeWatched,anList, classList);

        //Bottom Menu
        HBox bottomMenu = new HBox();
        bottomMenu.getChildren().addAll(buttonB1,buttonC,buttonN);

        //Border Plane 1
        Data1 = new BorderPane();
        Data1.setTop(topMenu);
        Data1.setBottom(bottomMenu);

        //Border Plane 2
        scene2 = new Scene(Data1,300,250);

        //Next Scene buttons
        buttonW.setOnAction(e-> window.setScene(scene2));
        buttonN.setOnAction(e-> window.setScene(scene3));
        buttonB2.setOnAction(e->{
                clearObservation();
                initObservation();
                window.setScene(scene2);
        });

        window.setScene(scene1);
        window.show();




    }

private void closeProgram(){
        Boolean result = ConfirmBox.display("Are You Sure?","Do you want to Exit?");
        if (result)


            window.close();
}

private  ComboBox<String> initClassList(){
    ComboBox<String> result = new ComboBox<>();
    result.getItems().addAll("Select a Class","Rouge", "Cleric", "Paladin", "Ranger", "Barbarian");
    result.setValue("Select a Class");
    result.setOnAction(e->{
        String Animal = anList.getValue();
        String pClass = result.getValue();
        System.out.println(Animal+ pClass);
        if(Animal.equals("Dog") && pClass.equals("Rouge"))
            b = 35;
        else if(Animal.equals("Dog") && pClass.equals("Cleric"))
            b =76 ;
        else if(Animal.equals("Dog") && pClass.equals("Paladin"))
            b = 116 ;
        else if(Animal.equals("Dog") && pClass.equals("Ranger"))
            b = 156 ;
        else if(Animal.equals("Dog") && pClass.equals("Barbarian"))
            b = 196 ;
        else if(Animal.equals("Cat") && pClass.equals("Rouge"))
            b = 40 ;
        else if(Animal.equals("Cat") && pClass.equals("Cleric"))
            b = 75;
        else if(Animal.equals("Cat") && pClass.equals("Paladin"))
            b = 110 ;
        else if(Animal.equals("Cat") && pClass.equals("Ranger"))
            b = 144;
        else if(Animal.equals("Cat") && pClass.equals("Barbarian"))
            b = 179;
        else if(Animal.equals( "Fish") && pClass== "Rouge")
            b = 20 ;
        else if(Animal.equals( "Fish" )&& pClass== "Cleric")
            b = 73;
        else if(Animal.equals( "Fish" )&& pClass== "Paladin")
            b = 126;
        else if(Animal.equals( "Fish") && pClass== "Ranger")
            b = 178 ;
        else if(Animal.equals( "Fish" )&& pClass== "Barbarian")
            b = 231;
        else if(Animal.equals( "Reptile") && pClass== "Rouge")
            b = 30;
        else if(Animal.equals( "Reptile" )&& pClass== "Cleric")
            b = 78;
        else if(Animal.equals( "Reptile") && pClass== "Paladin")
            b = 126;
        else if(Animal.equals( "Reptile" )&& pClass== "Ranger")
            b = 173;
        else if(Animal.equals( "Reptile" )&& pClass== "Barbarian")
            b = 221;
        else if(Animal.equals( "Bird" )&& pClass== "Rouge")
            b = 40;
        else if(Animal.equals( "Bird" )&& pClass== "Cleric")
            b = 79;
        else if(Animal.equals( "Bird") && pClass== "Paladin")
            b = 116;
        else if(Animal.equals( "Bird") && pClass== "Ranger")
            b = 154;
        else if(Animal.equals( "Bird") && pClass== "Barbarian")
            b = 191;
        else if(Animal.equals( "Equine") && pClass== "Rouge")
            b = 45;
        else if(Animal.equals( "Equine") && pClass== "Cleric")
            b = 86;
        else if(Animal.equals( "Equine") && pClass== "Paladin")
            b = 126;
        else if(Animal.equals( "Equine") && pClass== "Ranger")
            b = 166;
        else if(Animal.equals( "Equine") && pClass== "Barbarian")
            b = 206;
        else if(Animal.equals( "Small Mammal") && pClass== "Rouge")
            b = 10;
        else if(Animal.equals( "Small Mammal") && pClass== "Cleric")
            b = 51;
        else if(Animal.equals( "Small Mammal") && pClass== "Paladin")
            b = 91;
        else if(Animal.equals( "Small Mammal") && pClass== "Ranger")
            b = 131;
        else if(Animal.equals( "Small Mammal") && pClass== "Barbarian")
            b = 171;
        else if(Animal.equals( "Amphibian") && pClass== "Rouge")
            b = 40;
        else if(Animal.equals( "Amphibian") && pClass== "Cleric")
            b = 77;
        else if(Animal.equals( "Amphibian") && pClass== "Paladin")
            b = 114;
        else if(Animal.equals( "Amphibian") && pClass== "Ranger")
            b =150 ;
        else if(Animal.equals( "Amphibian") && pClass== "Barbarian")
            b = 187;
        else if(Animal.equals( "Bug") && pClass== "Rouge")
            b = 1;
        else if(Animal.equals( "Bug") && pClass== "Cleric")
            b = 40;
        else if(Animal.equals( "Bug") && pClass== "Paladin")
            b = 77;
        else if(Animal.equals( "Bug") && pClass== "Ranger")
            b = 115;
        else if(Animal.equals( "Bug") && pClass== "Barbarian")
            b = 152;
        else if(Animal.equals( "Farm Animal") && pClass== "Rouge")
            b = 50;
        else if(Animal.equals( "Farm Animal" )&& pClass== "Cleric")
            b = 88;
        else if(Animal.equals( "Farm Animal" )&& pClass== "Paladin")
            b = 126;
        else if(Animal.equals( "Farm Animal" )&& pClass== "Ranger")
            b = 163;
        else if(Animal.equals( "Farm Animal" )&& pClass== "Barbarian")
            b = 201;
        else if(Animal.equals( "Exotic") && pClass== "Rouge")
            b = 35;
        else if(Animal.equals( "Exotic") && pClass== "Cleric")
            b = 83;
        else if(Animal.equals( "Exotic") && pClass== "Paladin")
            b = 130;
        else if(Animal.equals( "Exotic") && pClass== "Ranger")
            b = 177;
        else if(Animal.equals( "Exotic" )&& pClass== "Barbarian")
            b = 224;
        else if(Animal.equals( "Plant" )&& pClass== "Rouge")
            b = 30;
        else if(Animal.equals( "Plant" )&& pClass== "Cleric")
            b = 68;
        else if(Animal.equals( "Plant" )&& pClass== "Paladin")
            b = 106;
        else if(Animal.equals( "Plant" )&& pClass== "Ranger")
            b = 143;
        else if(Animal.equals("Plant") && pClass== "Barbarian")
            b = 181;

        if(pClass.equals("Rouge"))
            OleftMenu.getChildren().addAll(button10,button11,button12);
        else if(pClass.equals("Cleric"))
            OleftMenu.getChildren().addAll(button13,button14,button15);
        else if(pClass.equals("Paladin"))
            OleftMenu.getChildren().addAll(button16,button17,button18);
        else if(pClass.equals("Ranger"))
            OleftMenu.getChildren().addAll(button19,button20,button21);
        else if(pClass.equals("Barbarian"))
            OleftMenu.getChildren().addAll(button22,button23,button24);



    });

    return result;
}
public void clearClassList(){
        classList = null;
}
public BorderPane initObservation(){
    Obsv = new BorderPane();
    OleftMenu = new VBox();
    HBox ObottomMenu = new HBox();
    ObottomMenu.getChildren().addAll(buttonB2,buttonHP);
    OleftMenu.getChildren().addAll(button1,button2,button3,button4,button5,button6,button7,button8,button9);
    Obsv.setLeft(OleftMenu);
    Obsv.setBottom(ObottomMenu);
    return Obsv;
}
public void clearObservation(){
        Obsv = null;
}
}
