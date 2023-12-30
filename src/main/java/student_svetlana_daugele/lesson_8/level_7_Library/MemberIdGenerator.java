package student_svetlana_daugele.lesson_8.level_7_Library;
import java.util.concurrent.atomic.AtomicInteger;
public class MemberIdGenerator {
    private static final AtomicInteger idCounter = new AtomicInteger(100);

    public static int generateMemberID() {
        return idCounter.getAndIncrement();
        }
    }
/*  решение кода  генератора ID найдено в интернете!!! Можно ли его применять?
idCounter.getAndIncrement() - это атомарная операция,
которая возвращает текущее значение idCounter
и затем увеличивает его на единицу.

get() - возвращает текущее значение idCounter.
incrementAndGet() - увеличивает значение idCounter на единицу
после возврата текущего значения.
Таким образом, idCounter.getAndIncrement() возвращает
текущее значение idCounter (которое будет использовано как member ID),
а затем увеличивает его на единицу для следующего использования
при генерации нового member ID.
Это обеспечивает уникальность ID при каждом вызове generateMemberID().
 */