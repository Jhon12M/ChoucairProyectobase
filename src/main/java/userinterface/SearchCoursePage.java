package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    public static final Target BUTTON_UC = Target.the("Selecciona la cursos y certificaciones")
            .located(By.xpath("//div[@id='certificaciones']//strong"));
    public static final Target INPUT_COURCE = Target.the("Buscar el curso")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Da click para buscar el curso")
            .located(By.xpath("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("Da click para buscar el curso")
            .located(By.xpath("//h4/a[contains(string(), 'Foundation Express')]"));
    public static final Target NAME_COURSE = Target.the("Estraer el nombre del curso")
            .located(By.xpath("//h1[contains(string(),'Foundation Express')]"));
}
