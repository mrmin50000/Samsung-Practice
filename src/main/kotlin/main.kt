fun main(){
    val student: Student? = Student()

    val student1 = student?.let{ st -> //не возвращает обратного значения, рабтаем через ключевое слово
        st.hi()
        st.bye()
        st.name = "Masha"
    }

    val student2 = student?.apply{ //возвращает измененный объект, работаем с содержимым объекта
        hi()
        bye()
        name = "LklKek"
    }

    val count = Student().run{ //возвращает обратное значение с посл. строки, работаем с содержимым объекта
        hi()
        bye()
        countOfDebts = 15
        countOfDebts
    }

    val str = with(Student()){
        hi()
        bye()
        name = "Pasha"
        name
    }
    println(str)

    val student3 = Student().also{ st -> //возвращает измененный объект, работаем через ключевое слово

        st.hi()
        st.bye()
        st.countOfDebts = 3
    }


}