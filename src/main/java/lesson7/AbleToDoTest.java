package lesson7;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


/**
 * + Создать класс, который может выполнять «тесты». AbleToDoTest +
 * + В качестве тестов выступают классы с наборами методов с
 * + аннотациями @Test.
 * + Для этого у него должен быть статический метод start(), которому в качестве параметра
 * + передается или объект типа Class, или имя класса.
 * + Из «класса-теста» вначале должен быть запущен метод с
 * + аннотацией @BeforeSuite, если такой имеется.
 * + Далее запущены методы с аннотациями @Test, а по завершении всех
 * + тестов – метод с аннотацией @AfterSuite.
 * + К каждому тесту необходимо добавить приоритеты (int числа от 1 до 10),
 * + в соответствии с которыми будет выбираться порядок их выполнения.
 * + Если приоритет одинаковый, то порядок не имеет
 * + значения.
 * + Методы с аннотациями @BeforeSuite и @AfterSuite должны присутствовать в единственном экземпляре, иначе
 * + необходимо бросить RuntimeException при запуске «тестирования».
 * Это домашнее задание никак не связано с темой тестирования через JUnit и использованием этой библиотеки: проект
 * ишется с нуля.
 */
public class AbleToDoTest {


    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        start(TestClass.class);
}

    private static void start(Class<TestClass> testClass) throws InvocationTargetException, IllegalAccessException {
        Method[] methods = testClass.getDeclaredMethods();
        int countBeforeSuite = 0;
        int countAfterSuite = 0;
        for (Method method : methods) {
            if(method.isAnnotationPresent(BeforeSuite.class)){
                countBeforeSuite++;
                if(countBeforeSuite == 1){
                    method.setAccessible(true);
                    method.invoke(testClass);
                }else{
                    throw new RuntimeException("Метод с аннтоацией BeforeSuits повторяется");
                }
            }
        }

        for (int i = 1; i < 11; i++) {
            for (Method method : methods) {
                if(method.isAnnotationPresent(Test.class)){
                    if(method.getAnnotation(Test.class).priority() == i){
                        method.setAccessible(true);
                        method.invoke(testClass);
                    }
                }
            }
        }

        for (Method method : methods) {
            if(method.isAnnotationPresent(AfterSuite.class)){
                countAfterSuite++;
                if(countAfterSuite == 1){
                    method.setAccessible(true);
                    method.invoke(testClass);
                }else{
                    throw new RuntimeException("Метод с аннтоацией AfterSuite повторяется");
                }
            }
        }
    }

}
