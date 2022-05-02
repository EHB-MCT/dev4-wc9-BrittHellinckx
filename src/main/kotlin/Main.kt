import java.util.*
import kotlin.math.absoluteValue

fun main(args: Array<String>) {
    val reader = FileReader();

    //EX 1
    ////exOne(reader)
    //EX 2
    ////exTwo(reader);
    //EX 3
    ////exThree(reader);

    //EX 4
    //println(reader.getPuzzle4Numbers())
    //println(reader.getPuzzle4Cards())
}
fun exOne(reader: FileReader){
    val numbers = reader.getPuzzle1()
    //PART ONE
    /*
    var prevNumber = 0;
    var higher = 0;
    var lower = 0;
    for(number in numbers){
        if(prevNumber ==0) {
            //
        }
        else if(number>prevNumber){
            higher++;
        }else if (number<prevNumber){
            lower++;
        }
        prevNumber = number;
    }
    println(higher);
    */

    //PART TWO
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
            //
        }
        else if(totalNumber>prevNumber){
            higher++;
        }else if (totalNumber<prevNumber){
            lower++;
        }
        prevNumber = totalNumber;
    }else{
        //
    }
    }
    println(higher);
}
fun exTwo(reader: FileReader){
var movements =reader.getPuzzle2()
var direction = "";
var amount = 0;

var horizontal = 0;
var vertical = 0;
var aim = 0;
for (movement in movements){
    direction = movement[0] as String;
    amount = movement[1] as Int;

    if(direction == "forward"){
        horizontal+=amount;
        vertical+= aim*amount;
    }else if(direction == "down"){
        aim+= amount;
    }else if(direction=="up"){
        aim-= amount;
    }
}
var totalMovement =horizontal*vertical;
println(totalMovement);
}
fun exThree(reader:FileReader){
var binairy = reader.getPuzzle3();
var gamma = "";
var epsilon = "";

//// COUNT FOR ZERO
var nr0Count0 = 0
var nr1Count0 =0
var nr2Count0 =0
var nr3Count0 =0
var nr4Count0 =0
var nr5Count0 = 0
var nr6Count0 =0
var nr7Count0 =0
var nr8Count0 =0
var nr9Count0 =0
var nr10Count0 =0;
var nr11Count0 =0

//// COUNT FOR ONE
var nr0Count1 = 0
var nr1Count1 =0
var nr2Count1 =0
var nr3Count1 =0
var nr4Count1 =0
var nr5Count1 = 0
var nr6Count1 =0
var nr7Count1 =0
var nr8Count1 =0
var nr9Count1 =0
var nr10Count1 =0;
var nr11Count1 =0

for ((index, x) in binairy.withIndex()){
    //// COUNT
    when(x[0]){
        0-> nr0Count0++
        1-> nr0Count1++
    }
    when(x[1]){
        0-> nr1Count0++
        1->nr1Count1++
    }
    when(x[2]){
        0-> nr2Count0++
        1-> nr2Count1++
    }
    when(x[3]){
        0-> nr3Count0++
        1->nr3Count1++
    }
    when(x[4]){
        0-> nr4Count0++
        1-> nr4Count1++
    }
    when(x[5]){
        0-> nr5Count0++
        1->nr5Count1++
    }
    when(x[6]){
        0-> nr6Count0++
        1-> nr6Count1++
    }
    when(x[7]){
        0-> nr7Count0++
        1->nr7Count1++
    }
    when(x[8]){
        0-> nr8Count0++
        1-> nr8Count1++
    }
    when(x[9]){
        0-> nr9Count0++
        1->nr9Count1++
    }
    when(x[10]){
        0-> nr10Count0++
        1-> nr10Count1++
    }
    when(x[11]){
        0-> nr11Count0++
        1->nr11Count1++
    }
}
////// CHECK COUNT
if(nr0Count0>nr0Count1) {
    gamma+= "0"
    epsilon+= "1"
}else{
    gamma+= "1"
    epsilon+= "0"
}
if(nr1Count0>nr1Count1) {
    gamma+= "0"
    epsilon+= "1"
}else{
    gamma+= "1"
    epsilon+= "0"
}
if(nr2Count0>nr2Count1){
    gamma+= "0"
    epsilon+= "1"
}else{
    gamma+= "1"
    epsilon+= "0"
}
if(nr3Count0>nr3Count1) {
    gamma+= "0"
    epsilon+= "1"
}else{
    gamma+= "1"
    epsilon+= "0"
}
if(nr4Count0>nr4Count1) {
    gamma+= "0"
    epsilon+= "1"
}else{
    gamma+= "1"
    epsilon+= "0"
}
if(nr5Count0>nr5Count1){
    gamma+= "0"
    epsilon+= "1"
}else{
    gamma+= "1"
    epsilon+= "0"
}
if(nr6Count0>nr6Count1) {
    gamma+= "0"
    epsilon+= "1"
}else{
    gamma+= "1"
    epsilon+= "0"
}
if(nr7Count0>nr7Count1) {
    gamma+= "0"
    epsilon+= "1"
}else{
    gamma+= "1"
    epsilon+= "0"
}
if(nr8Count0>nr8Count1){
    gamma+= "0"
    epsilon+= "1"
}else{
    gamma+= "1"
    epsilon+= "0"
}
if(nr9Count0>nr9Count1) {
    gamma+= "0"
    epsilon+= "1"
}else{
    gamma+= "1"
    epsilon+= "0"
}
if(nr10Count0>nr10Count1) {
    gamma+= "0"
    epsilon+= "1"
}else{
    gamma+= "1"
    epsilon+= "0"
}
if(nr11Count0>nr11Count1){
    gamma+= "0"
    epsilon+= "1"
}else{
    gamma+= "1"
    epsilon+= "0"
}
var num1 = gamma.toInt(2)
var num2 = epsilon.toInt(2)
var total = num1*num2;
println(total)
}