package vrt.domain;



//this is the resource representation class
public class Article {

    private long id = 0;

    //For this sprint, dates expressed by integers
    private Integer theYear;
    private Integer monthOfYear;
    private Integer dayOfMonth;

    private String title;
    private String content;

    //Suppose a new field is necessary, e.g. Source of an article.
    // The article structure changes
    private String source;


    public Article() {
    }

    public Article(long id , Integer theYear, Integer monthOfYear, Integer dayOfMonth, String title, String content) throws IllegalArgumentException {

        this.id = id;
        if (theYear > 2018 )
            throw new IllegalArgumentException("Articles in the future are not allowed, check Year");
        this.theYear = theYear;

        if (monthOfYear > 12 )
            throw new IllegalArgumentException("no more than 12 month in a year");
        this.monthOfYear = monthOfYear;

        if (dayOfMonth > 31 )
            throw new IllegalArgumentException("max 31 days in a month");
        this.dayOfMonth = dayOfMonth;

        if (title ==null)
            throw new IllegalArgumentException("title is missing");
        this.title = title;

        if (content == null)
            throw new IllegalArgumentException("no content");
        this.content = content;
    }

    public Article(long id , Integer theYear, Integer monthOfYear, Integer dayOfMonth, String title, String content, String source){
        this(id, theYear, monthOfYear, dayOfMonth, title, content);
        this.source = source;
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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
