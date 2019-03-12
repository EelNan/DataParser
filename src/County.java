public class County {
    private String name;
    private int fips;
    private Election2016 vote2016;
    private Education2016 educ2016;
    private Employment2016 employ2016;

    public County(String name, int fips, Election2016 vote2016, Education2016 educ2016, Employment2016 employ2016) {
        this.name = name;
        this.fips = fips;
        this.vote2016 = vote2016;
        this.educ2016 = educ2016;
        this.employ2016 = employ2016;
    }

    public Education2016 getEduc2016() {
        return educ2016;
    }

    public Election2016 getVote2016() {
        return vote2016;
    }

    public Employment2016 getEmploy2016() {
        return employ2016;
    }

    public int getFips() {
        return fips;
    }

    public String getName() {
        return name;
    }

    public void setEduc2016(Education2016 educ2016) {
        this.educ2016 = educ2016;
    }

    public void setEmploy2016(Employment2016 employ2016) {
        this.employ2016 = employ2016;
    }

    public void setFips(int fips) {
        this.fips = fips;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVote2016(Election2016 vote2016) {
        this.vote2016 = vote2016;
    }
}
