package day10;

public class Day10_1 {

	public static void main(String[] args) {
		AsteroidMapper mapper = new AsteroidMapper("##.#..#..###.####...######,#..#####...###.###..#.###.,..#.#####....####.#.#...##,.##..#.#....##..##.#.#....,#.####...#.###..#.##.#..#.,..#..#.#######.####...#.##,#...####.#...#.#####..#.#.,.#..#.##.#....########..##,......##.####.#.##....####,.##.#....#####.####.#.####,..#.#.#.#....#....##.#....,....#######..#.##.#.##.###,###.#######.#..#########..,###.#.#..#....#..#.##..##.,#####.#..#.#..###.#.##.###,.#####.#####....#..###...#,##.#.......###.##.#.##....,...#.#.#.###.#.#..##..####,#....#####.##.###...####.#,#.##.#.######.##..#####.##,#.###.##..##.##.#.###..###,#.####..######...#...#####,#..#..########.#.#...#..##,.##..#.####....#..#..#....,.###.##..#####...###.#.#.#,.##..######...###..#####.#");
		System.out.println(mapper.visibilityFromBestPositionForStation());
	}
	
}