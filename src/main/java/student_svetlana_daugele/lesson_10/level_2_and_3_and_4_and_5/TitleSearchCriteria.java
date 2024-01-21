package student_svetlana_daugele.lesson_10.level_2_and_3_and_4_and_5;

class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        return book.getTitle().equals(titleToSearch);

    }

}

