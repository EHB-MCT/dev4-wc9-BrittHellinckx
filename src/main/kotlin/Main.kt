import kotlin.math.absoluteValue

fun main(args: Array<String>) {
    val reader = FileReader();

    //println(reader.getPuzzle1())
    val numbers = reader.getPuzzle1()

    var number1 =0;
    var number2 =0;
    var number3 =0;
    var totalNumber = 0;
    var prevNumber = 0;

    var higher = 0;
    var lower = 0;

    for (number in numbers.indices){
        if(number3!=numbers.last()){
            number1 = numbers[number];
            number2 = numbers[number+1];
            number3= numbers[number+2];
            totalNumber = number1+ number2+ number3;

            if(prevNumber ==0) {
                println("start");
            }
            else if(totalNumber>prevNumber){
                //println("higher");
                higher++;
            }else if (totalNumber<prevNumber){
                //println("lower")
                lower++;
            }
            prevNumber = totalNumber;
        }else{
            println("end")
        }
    }
    println(higher);

    //////////////////////////////////////////////////
    //println(reader.getPuzzle2())
    //println(reader.getPuzzle3())
    //println(reader.getPuzzle4Numbers())
    //println(reader.getPuzzle4Cards())
}