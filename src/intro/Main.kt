//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var num1 = 12;
    var num2: Int = num1;
    num1 = 55;

    println("Digite a sua idade: ");
    var idade = readln().toIntOrNull() ?: 0;

    if(idade != null){
        println("No ano que vem sua idade será: ${idade + 1}");
    }else{
        println("Idade digitada de forma incorreta: ${idade}");
    }

    //exercício 1
    println("Digite uma palavra: ");
    var palavra = readln();

    if(palavra != null){
        println("Palavra em letras maiúsculas: ${palavra.uppercase()}");
        println("Palavra em letras minúsculas: ${palavra.lowercase()}");
    }else{
        println("Palavra digitada de forma incorreta");
    }

}