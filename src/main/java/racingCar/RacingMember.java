package racingCar;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RacingMember {
    @JsonProperty("name")
    public String name;
    @JsonProperty("count")
    public int count;

    public RacingMember(){}
    public RacingMember (String name, int count)
    {
        this.name = name;
        this.count = count;
    }
}
