import java.util.*

fun main() {
//   person1
    val person1=Person()
    person1.info("Grace Kendi","Female",23,54.6,"S.African")
    val likes=arrayOf("Pilau","Chips Masala","Chicken","Matoke")
    person1.likes(likes,"Maldives")
    person1.hobbies(arrayOf("hiking","cooking","listening to music","dancing","travelling"))
    person1.friend("Melannie Tamara")
    person1.character("The advocate")

//    person 2
    val person2=Person()
    person2.info("Lavign Micheni","Male",45,85.3,"Kenyan")
    val like=arrayOf("Ugali","Fish","Rice","Mukimo")
    person2.likes(like,"Durban")
    person2.hobbies(arrayOf("Grazing","Travelling","going for fellowships","reading newspapers"))
    person2.friend("Bedford Nyaga")
    person2.character("The visionary")

}
interface personDetails{
    fun info(name:String,gender:String,age:Int,weight:Double,nationality:String)
    fun likes(food:Array<String>,country:String)
    fun hobbies(hobby:Array<String>)
    fun friend(name:String)
    fun character(trait:String)

}
class Person: personDetails{
    override  fun info(name:String,gender:String,age:Int,weight:Double,nationality:String) {
        println("My name is $name and I am $nationality.I am a $age year old $gender coder.The last time i checked,my weight was $weight")
    }
    override  fun likes(food:Array<String>,country:String){
        var theFood=Arrays.toString(food)
        println("My favorite food is $theFood.I would love to visit the $country one day and have and see the types of food they eat there.")
    }
    override fun hobbies(hobby:Array<String>){
        var theHobby=Arrays.toString(hobby)
        println("When am not coding,i have other things i do to keep me busy.I love $theHobby")
    }
    override  fun friend(name:String){
        println("My best friend is $name and i love every moment we spend together.")
    }
    override   fun character(trait:String){
        println("My personality  type is: $trait")
    }

}