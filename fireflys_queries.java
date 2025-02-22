import java.util.Scanner;
import java.util.Vector;

public class fireflys_queries {
    static long nthRoundRangeSum(long roundNumber, long leftIndex, long rightIndex, Vector<Long> a, Vector<Long> prefixSum, long n) {
        long startIndex = roundNumber;
        long updatedStart = (startIndex + leftIndex - 1) % n;
        long updatedEnd = (startIndex + rightIndex - 1) % n;

        if (updatedStart == 0) {
            updatedStart += n;
        }

        if (updatedEnd == 0) {
            updatedEnd += n;
        }

        if (updatedStart <= updatedEnd) {
            return (prefixSum.get((int) updatedEnd) - prefixSum.get((int) updatedStart - 1));
        } else {
            return ((prefixSum.get((int) n) - prefixSum.get((int) updatedStart - 1)) + prefixSum.get((int) updatedEnd));
        }
    }

    static void solve(Scanner scanner) {
        if (!scanner.hasNextLong()) return;  
        long n = scanner.nextLong();
        long q = scanner.nextLong();
        Vector<Long> a = new Vector<>();
        Vector<Long> prefixSum = new Vector<>();

        // Initialize prefixSum with zeros
        for (int i = 0; i <= n; i++) {
            prefixSum.add(0L);
        }

        long totSum = 0;

        for (long i = 1; i <= n; i++) {
            if (!scanner.hasNextLong()) return;  
            long num = scanner.nextLong();
            a.add(num);
            totSum += num;
            prefixSum.set((int) i, num + prefixSum.get((int) (i - 1)));
        }

        while (q-- > 0) {
            if (!scanner.hasNextLong()) return; 
            long l = scanner.nextLong();
            if (!scanner.hasNextLong()) return;  
            long r = scanner.nextLong();

            long ans = 0;
            long startRound = l / n;
            if (l % n != 0) {
                startRound++;
            }
            long endRound = r / n;
            if (r % n != 0) {
                endRound++;
            }
            if (startRound == endRound) {
                long leftIndex = l % n;
                if (leftIndex == 0) {
                    leftIndex += n;
                }
                long rightIndex = r % n;
                if (rightIndex == 0) {
                    rightIndex += n;
                }
                ans += nthRoundRangeSum(startRound, leftIndex, rightIndex, a, prefixSum, n);
            } else {
                long totalRound = endRound - startRound + 1;
                ans += ((totalRound - 2) * 1L * totSum);

                long leftIndex = l % n;

                if (leftIndex == 0) {
                    leftIndex += n;
                }

                long rightIndex = r % n;
                if (rightIndex == 0) {
                    rightIndex += n;
                }

                ans += nthRoundRangeSum(startRound, leftIndex, n, a, prefixSum, n);
                ans += nthRoundRangeSum(endRound, 1, rightIndex, a, prefixSum, n);
            }
            System.out.println(ans);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextLong()) return;  
        long t = scanner.nextLong();
        while (t-- > 0) {
            solve(scanner);
        }
    }
}
