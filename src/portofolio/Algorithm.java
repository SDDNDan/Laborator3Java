package portofolio;

import assets.Asset;

import java.util.List;

/**
 * Interface defined to solve algorithms like random or greedy.
 */
public interface Algorithm {
    List<Asset> solve(List<Asset> assets, int maxValue);


}
