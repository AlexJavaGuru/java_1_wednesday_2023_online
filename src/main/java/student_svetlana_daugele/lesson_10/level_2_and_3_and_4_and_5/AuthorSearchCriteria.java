package student_svetlana_daugele.lesson_10.level_2_and_3_and_4_and_5;

class AuthorSearchCriteria implements SearchCriteria  {

        private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
            this.authorToSearch = authorToSearch;
        }

        public boolean match(Book book) {
            return book.getAuthor().equals(authorToSearch);
        }

    }


