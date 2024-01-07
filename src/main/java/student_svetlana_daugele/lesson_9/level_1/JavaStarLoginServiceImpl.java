package student_svetlana_daugele.lesson_9.level_1;

class JavaStarLoginServiceImpl implements JavaStarLoginService {
    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }
}
