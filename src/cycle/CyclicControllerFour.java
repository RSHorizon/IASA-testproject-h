package cycle;

public class CyclicControllerFour {
    CyclicControllerFive cyclicControllerFive;

    void CyclicControllerFour(){
        cyclicControllerFive = new CyclicControllerFive();
    }
}
