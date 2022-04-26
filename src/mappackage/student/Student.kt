package mappackage.student

class Student(var fullName: String,var age: Int,var course: Int,var faculty: String) {

    override fun toString(): String {
        return "Student{" +
        "fullName='" + fullName + '\'' +
        ", age=" + age +
        ", course=" + course +
        ", faculty='" + faculty + '\'' +
        '}'
    }
}