package student_svetlana_daugele.lesson_10.level_2_and_3_and_4_and_5;

class SearchCriteriaDemo {
    public static void main(String[] args) {
        SearchCriteria authorCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearCriteria = new YearOfIssueSearchCriteria("1890");
        SearchCriteria andSearchCriteria1 = new AndSearchCriteria(authorCriteria, titleCriteria);
        SearchCriteria andSearchCriteria2 = new AndSearchCriteria(authorCriteria, yearCriteria);
        SearchCriteria orSearchCriteria1 = new OrSearchCriteria(authorCriteria, yearCriteria);
        SearchCriteria orSearchCriteria2 = new OrSearchCriteria(orSearchCriteria1, titleCriteria);
    }
}
