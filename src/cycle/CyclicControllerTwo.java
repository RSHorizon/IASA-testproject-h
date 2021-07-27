package cycle;

public class CyclicControllerTwo {
    CyclicControllerThree cyclicControllerThree;

    void CyclicControllerTwo(){
        cyclicControllerThree = new CyclicControllerThree();
    }
}
