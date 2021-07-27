package cycle;

public class CyclicControllerOne {
    CyclicControllerTwo cyclicControllerTwo;

    void CyclicControllerOne(){
        cyclicControllerTwo = new CyclicControllerTwo();
    }
}
