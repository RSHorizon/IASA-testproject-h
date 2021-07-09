import numbers.imaginary.imaginaryController.ComplexNumberEvalController;
import numbers.imaginary.imaginaryController.ComplexNumberFormalController;
import numbers.imaginary.imaginaryController.ComplexNumberGenerationController;
import numbers.imaginary.imaginaryEntity.ComplexNumberEntity;
import numbers.real.realController.OriginalNumberController;
import numbers.real.realEntity.OldNumberEntity;
import string.stringController.StringConversionController;
import string.stringEntity.CharacterEntity;

public class main {

    public static void main(String[] args) {
        ComplexNumberEvalController complexNumberEvalController = new ComplexNumberEvalController();
        complexNumberEvalController.eval(new ComplexNumberEntity());
        ComplexNumberFormalController complexNumberFormalController = new ComplexNumberFormalController();
        complexNumberFormalController.formal(new ComplexNumberEntity());
        ComplexNumberGenerationController complexNumberGenerationController = new ComplexNumberGenerationController();
        complexNumberGenerationController.generateCN();

        OriginalNumberController originalNumberController = new OriginalNumberController();
        originalNumberController.processOriginalNumber(new OldNumberEntity());

        StringConversionController stringConversionController = new StringConversionController();
        stringConversionController.conversion(new CharacterEntity[]{});
    }
}
