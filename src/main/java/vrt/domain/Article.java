package vrt.domain;


//this is the resource representation class
public class Article {

    private long id;

    //For this sprint, dates expressed by integers
    private Integer theYear;
    private Integer monthOfYear;
    private Integer dayOfMonth;

    private String title;
    private String content;

    public Article() {
    }

    public Article(long id, Integer theYear, Integer monthOfYear, Integer dayOfMonth, String title, String content) {
        this.id = id;
        this.theYear = theYear;
        this.monthOfYear = monthOfYear;
        this.dayOfMonth = dayOfMonth;
        this.title = title;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public Integer getTheYear() {
        return theYear;
    }

    public void setTheYear(Integer theYear) {
        this.theYear = theYear;
    }

    public Integer getMonthOfYear() {
        return monthOfYear;
    }

    public void setMonthOfYear(Integer monthOfYear) {
        this.monthOfYear = monthOfYear;
    }

    public Integer getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(Integer dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
