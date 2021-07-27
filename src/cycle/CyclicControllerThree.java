package cycle;

public class CyclicControllerThree {
    CyclicControllerFour cyclicControllerFour;

    void CyclicControllerThree(){
        cyclicControllerFour = new CyclicControllerFour();
    }
}
