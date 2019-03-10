public class Election2016 {
    private double demVotes;
    private double gopVotes;
    private double totalVotes;

    public Election2016(double demVotes, double gopVotes, double totalVotes) {
        this.demVotes = demVotes;
        this.gopVotes = gopVotes;
        this.totalVotes = totalVotes;
    }

    public double getDemVotes() {
        return demVotes;
    }

    public double getGopVotes() {
        return gopVotes;
    }

    public double getTotalVotes() {
        return totalVotes;
    }

    public void setDemVotes(double demVotes) {
        this.demVotes = demVotes;
    }

    public void setGopVotes(double gopVotes) {
        this.gopVotes = gopVotes;
    }

    public void setTotalVotes(double totalVotes) {
        this.totalVotes = totalVotes;
    }
}
