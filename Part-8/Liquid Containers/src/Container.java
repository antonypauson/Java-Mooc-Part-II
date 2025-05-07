public class Container {
    private int first;
    private int second;

    public Container() {
        this.first = 0;
        this.second = 0;
    }

    @Override
    public String toString() {
        return "First: " + this.first + "/100\n" +
                "Second: " + this.second + "/100\n";
    }

    public void addContainer(int value) {
        if (value + first > 100) {
            first = 100;
        } else {
            first += value;
        }

    }

    public void moveContainer(int value) {
        if (value > 0) {
            if ((this.first > value) && (this.first > 0)) {
                this.first -= value;
                if (this.second + value > 100) {
                    this.second = 100;
                } else {
                    this.second += value;
                }
            } else {
                if (this.first > 0) {
                    if (this.second + value > 100) {
                        this.second = 100;
                    } else {
                        this.second += this.first;
                    }
                    this.first = 0;
                }
            }
        }
    }

    public void removeContainer(int value) {
        if (value > 0 && this.second > 0) {
            if (this.second - value > 0) {
                this.second -= value;
            } else {
                this.second = 0;
            }
        }
    }
}
