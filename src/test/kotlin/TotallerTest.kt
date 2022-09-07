import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class TotallerTest{
    @Test // annotation

    // tests are made up of actions and assertions
    // actions - parts of the code that do something
    // assertions - parts of the code that checks something




    fun shouldBeAbleToAdd3And4(){
        val totaller = Totaller()

        //assertEquals are assertion which checks that the two values its given are equal

        assertEquals(3, totaller.add(3))
        assertEquals(7, totaller.add(4))
        assertEquals(7, totaller.total)
    }
}

// it's possible to name function using back-ticks(`)
fun `should be able to add 3 and 4 - and it mustn't go wrong` (){

}