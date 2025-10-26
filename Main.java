//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        var resulta = dog + 4;
        System.out.println(resulta);
        var resultb = cat + 4;
        System.out.println(resultb);
        var resultc = paper + 4;
        System.out.println(resultc);


        var resultx = dog - 3.5;
        System.out.println(resultx);
        var resulty = cat - 1.6;
        System.out.println(resulty);
        var resultz = paper - 7639;
        System.out.println(resultz);


        var friend = 19;
        System.out.println(friend);
        var resultf = friend + 2;
        System.out.println(resultf);
        var resultfr = resultf / 7;
        System.out.println(resultfr);



        var frog = 3.5;
        System.out.println(frog);
        var result = frog * 10;
        System.out.println(result);
        var resultF = result / 3.5;
        System.out.println(resultF);
        var resultFr = resultF + 4;
        System.out.println(resultFr);



        var massBoxer1 = 78.2;
        var massBoxer2 = 82.7;
        var totalMass = massBoxer1 + massBoxer2;
        System.out.println("Общая масса боксеров " + totalMass + " кг");
        var massDifference = massBoxer2 - massBoxer1;
        System.out.println("Разница между массами бойцов " + massDifference + " кг");
        var massDivision = massBoxer2 % massBoxer1;
        System.out.println("Остаток от деления масс: " + massDivision);







        var fullTime = 640;
        var dayTime = 8;
        var worker = fullTime / dayTime;
        System.out.println("Всего работников в компании " + worker + " человек");

        var addWorker = worker + 94;
        var addFullTime = addWorker * dayTime;
        System.out.println("Если в компании работает " + addWorker + " человек, то всего " + addFullTime + " часов работы может быть поделено между сотрудниками");














            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.

    }
}