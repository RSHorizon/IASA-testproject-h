import numbers.imaginary.controller.ComplexNumberEvalController;
import numbers.imaginary.controller.ComplexNumberFormalController;
import numbers.imaginary.controller.ComplexNumberGenerationController;
import numbers.imaginary.entity.ComplexNumberEntity;
import numbers.real.controller.OriginalNumberController;
import numbers.real.entity.OldNumberEntity;
import string.controller.StringConversionController;
import string.entity.CharacterEntity;

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
