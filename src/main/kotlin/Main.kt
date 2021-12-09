/** Задача на 3 вида скобок **/
fun main(){
    val s:String = readLine().toString()
    print(check(s))
}

fun check(s:String): String {
    val st = mutableListOf<Char>() // Создаем стек для скобок
    val per = "(){}[]"
    for (i in s.indices) {
        val index = per.indexOf(s[i])
        //p
        if (index >= 0) {
            if (index % 2 == 1) { // Если закрывающая скобка
                if (st.size == 0) return "NO" // Если стек пустой, значит расстановка неправильная
                val last = st.lastOrNull() // Берем последний элемент из стека
                st.removeLastOrNull() // После того, как взяли элемент, сразу удаляем его из стека
                if (last != per[index - 1]) {
                    return "NO" // Если последний элемент из стека не будет соответствовать текущему, то расстановка неправильная
                }
            } else st.add(s[i])
        } else return "NO"
    }
    return "YES"
}

/** Задача на простые круглые скобки **/
/*fun main() {
    val s: String = readLine().toString()
    print(check(s))
}

fun check(s: String): String {
    var k = 0
    for (i in s){
        if (i == '('){
            k += 1;
        } else k -= 1
    }
    if (k == 0){
        return "YES"
    } else return "NO"
}*/