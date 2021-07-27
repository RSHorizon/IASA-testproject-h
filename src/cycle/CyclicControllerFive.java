package cycle;

public class CyclicControllerFive {
    CyclicControllerOne cyclicControllerOne;

    void CyclicControllerFive (){
        cyclicControllerOne = new CyclicControllerOne();
    }
}
