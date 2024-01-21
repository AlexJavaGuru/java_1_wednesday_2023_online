package student_svetlana_daugele.lesson_10.level_2_and_3_and_4_and_5;

class SearchCriteriaTest {
    public static void main(String[] args) {


        SearchCriteriaTest searchCriteriaTest = new SearchCriteriaTest();
        searchCriteriaTest.testAuthorCriteria1();
        searchCriteriaTest.testAuthorCriteria2();
        searchCriteriaTest.testTitleCriteria1();
        searchCriteriaTest.testTitleCriteria2();
        searchCriteriaTest.testYearCriteria1();
        searchCriteriaTest.testYearCriteria2();
        searchCriteriaTest.testAndCriteria1();
        searchCriteriaTest.testAndCriteria2();
        searchCriteriaTest.testOrCriteria1();
        searchCriteriaTest.testOrCriteria2();
    }

    private void testOrCriteria2() {
        SearchCriteria searchCriteria = new OrSearchCriteria(
                new AuthorSearchCriteria("1"),
                new TitleSearchCriteria("1")
        );
        Book book = new Book("2", "2");
        checkResult(!searchCriteria.match(book));
    }

    private void testOrCriteria1() {
        SearchCriteria searchCriteria = new OrSearchCriteria(
                new AuthorSearchCriteria("1"),
                new TitleSearchCriteria("1")
        );
        Book book = new Book("2", "1");
        checkResult(searchCriteria.match(book));
    }

    private void testAndCriteria2() {
        SearchCriteria searchCriteria = new AndSearchCriteria(
                new AuthorSearchCriteria("a"),
                new TitleSearchCriteria("b"));
        Book book = new Book("a", "a");
        checkResult(!searchCriteria.match(book));
    }

    private void testAndCriteria1() {
        SearchCriteria searchCriteria = new AndSearchCriteria(
                new AuthorSearchCriteria("a"),
                new TitleSearchCriteria("a"));
        Book book = new Book("a", "a");
        checkResult(searchCriteria.match(book));
    }

    private void testYearCriteria2() {
        SearchCriteria searchCriteria = new YearOfIssueSearchCriteria("2022");
        Book book = new Book("1", "1", "2023");
        checkResult(!searchCriteria.match(book));
    }

    private void testYearCriteria1() {
        SearchCriteria searchCriteria = new YearOfIssueSearchCriteria("2023");
        Book book = new Book("1", "1", "2023");
        checkResult(searchCriteria.match(book));
    }

    private void testTitleCriteria2() {
        SearchCriteria searchCriteria = new TitleSearchCriteria("1");
        Book book = new Book("1", "2");
        checkResult(!searchCriteria.match(book));
    }

    private void testTitleCriteria1() {
        SearchCriteria searchCriteria = new TitleSearchCriteria("1");
        Book book = new Book("1", "1");
        checkResult(searchCriteria.match(book));
    }

    private void testAuthorCriteria2() {
        SearchCriteria searchCriteria = new AuthorSearchCriteria("1");
        Book book = new Book("2", "1");
        checkResult(!searchCriteria.match(book));
    }

    private void testAuthorCriteria1() {
        SearchCriteria searchCriteria = new AuthorSearchCriteria("1");
        Book book = new Book("1", "1");
        checkResult(searchCriteria.match(book));
    }

    private void checkResult(Boolean actualResult) {
        if (actualResult) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test FAILED");
        }
    }
}