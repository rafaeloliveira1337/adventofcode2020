package Day03

class Day03Input {
    companion object {
        val input = arrayOf(
            ".....##.#.....#........#....##.",
            "....#...#...#.#.......#........",
            ".....##.#......#.......#.......",
            "...##.........#...#............",
            "........#...#.......#.........#",
            "..........#......#..#....#....#",
            "..................#..#..#....##",
            ".....##...#..#..#..#..#.##.....",
            "..##.###....#.#.........#......",
            "#.......#......#......#....##..",
            ".....#..#.#.......#......#.....",
            "............#............#.....",
            "...#.#........#........#.#.##.#",
            ".#..#...#.....#....##..........",
            "##..........#...#...#..........",
            "...........#...###...#.......##",
            ".#..#............#........#....",
            "##.#..#.....#.......#.#.#......",
            ".##.....#....#.#.......#.##....",
            "..##...........#.......#..##.#.",
            "##...#.#........#..#...#...#..#",
            ".#..#........#.#.......#..#...#",
            ".##.##.##...#.#............##..",
            "..#.#..###......#..#......#....",
            ".#..#..#.##.#.##.#.#...........",
            "...#....#..#.#.#.........#..#..",
            "......#.#....##.##......#......",
            "#....#.##.##....#..#...........",
            "...#.#.#.#..#.#..#.#..#.##.....",
            "#.....#######.###.##.#.#.#.....",
            "..#.##.....##......#...#.......",
            "..#....#..#...##.#..#..#..#..#.",
            ".............#.##....#.........",
            ".#....#.##.....#...............",
            ".#............#....#...#.##....",
            ".#.....#.##.###.......#..#.....",
            ".#...#.........#.......#..#....",
            "..#.#..#.##.......##...........",
            ".....##..#..#..#..#.##..#.....#",
            "..##............##...#..#......",
            "...#..#....#..##.....##..#.#...",
            "#.....##....#.#.#...#...#..##.#",
            "#.#..#.........#.##.#...#.#.#..",
            ".....#.#....##....#............",
            "#.......#..#.....##..#...#...#.",
            ".....#.#...#...#..#......#.....",
            "..##....#.#.#.#.#..#...........",
            "##..#...#.........#......#...#.",
            "..#...#.#.#.#..#.#.##..##......",
            "#............###.....###.......",
            "..........#...#........###.....",
            ".......##...#...#...#........#.",
            ".#..#.##.#.....................",
            ".#..##........##.##...#.......#",
            ".......##......#.....#......#..",
            ".##.#.....#......#......#......",
            "#...##.#.#...#.#...............",
            "........#..#...#.##.......#....",
            "...................#...#...##..",
            "...#...#.........#.....#..#.#..",
            ".###..#........#..##.##..#.##..",
            "#...#.....#.....#.....#..#..#..",
            "###..#.....#.#.#.#......#....#.",
            "#........#....##.#...##........",
            ".#.#..##........##....##.#.#...",
            "#...#....#.###.#.#.........#...",
            "...#...##..###.......#.........",
            "......#....#..##..#.....#.#....",
            "........#...##...###......##...",
            "..........##.#.......##........",
            "...#....#......#...##.....#....",
            "###.#.....#.#..#..#....#...#..#",
            ".#.....#.#....#...............#",
            "..#....#....####....###....#.#.",
            "....##........#..#.##.#....#...",
            ".......##...#...#..#....####...",
            "#...##.#......##...#..#........",
            "..##..#.##....#.......##.#.#...",
            "..#.#...............#...#.#....",
            "....#.....#.#.....#.##.......#.",
            "...#.#..##.#.#..............##.",
            "..#.....#...#.............#.##.",
            "##..#.#...#........#..#.....##.",
            "...........##...#.#.###...#....",
            "...#.#.#..#..................#.",
            ".#...##.............#...#......",
            "..#..#...#.#.......#...#.....#.",
            "..##.......#.#.................",
            ".##..#........###.....#....#.##",
            "......#..###.......#....##....#",
            "....#.....#.................#..",
            "........#...#...#..............",
            "...#..#.###.......#..#.#.#.##..",
            "..#...#.....#....#.........#...",
            "...#.............#........###..",
            "......#..............#......#..",
            "#..#...........#...#..........#",
            "...##...#.###..#...#.....#.#...",
            "....#..##......#.......##......",
            "....#....##.#...#.#..#....#...#",
            ".#...........#..#....##...#..##",
            "..#.#.................###.#...#",
            "..#.#.#...##...........#.......",
            "..........#..##...#.#..##....##",
            "........#........#.##..#.#...#.",
            ".....#...##.......##......#...#",
            "....#...#..#..#.....#..........",
            ".#..#......#..#..#..###.......#",
            ".##..........#...#...#.#.....##",
            "..#..........#.#.#...###.......",
            "....#................#...##....",
            ".##..#....#..........#.#.#.....",
            "..##...#.#........#.....#.##...",
            "....####.....#..#.........##..#",
            "......#.........#...#..........",
            "....#...................#..##..",
            ".##....#.#.........#....#...#..",
            "....##...##.....#..####........",
            "..##.#....#.#.......##...#.....",
            "#...#.#.#...#..#..##.....#.....",
            "#..................###.....#...",
            "#.#.....#.......#.#...###.#....",
            ".#..#....#............#........",
            "#.#....#..#.#...............#..",
            "..#..#..#.............#......#.",
            "..#.......##...................",
            ".#....#.........#....#.#.#..#..",
            "....#....#..#...............#..",
            "......#..#..##......#.........#",
            "..#.##........##......#..#..#.#",
            "#.....#.#....#.........##...#..",
            "###..............#....###...##.",
            "....#..##......#.......##......",
            "......#...#.##......##....#..#.",
            "..........#....#..##.......#..#",
            ".#..#...##..#...........#..#..#",
            ".....#....#...#..###...###....#",
            ".#####..#...#.#.#..#.#.###...##",
            "..##............##.#...#.##...#",
            ".##..#...#...#....##.#..#..##..",
            ".#....#...#............##..#...",
            ".#.#......#....#....#..##..##..",
            ".........#...#.......#.##..#...",
            "#.........#.....##.....#..#..#.",
            "...##.#...#...#..#..#....##..##",
            ".#............#...#....##......",
            "..#...#.##.........#.#......#.#",
            "....#.##........#.........#..##",
            "#.........#......#.#......#..#.",
            "........#.#.......#.#........#.",
            "..#..........##.#...#..#.#.....",
            "..#...#....#...#...#..#.#..#.#.",
            ".#.........#....#..#####..#....",
            "#.#....#.#.###...#.............",
            "..##...........##......##......",
            "#.....#..#....#...............#",
            "...#.#..#....##......#...##....",
            "...#........#.....#...#..#.....",
            ".#......##.........#......#....",
            "..#..###.##...#.#.....#........",
            ".............#......#..#.......",
            "..#...............#.#...#..#..#",
            ".......#..#...#.#####......#..#",
            ".........#.....#...............",
            "##........#............#.#.....",
            ".#...#.....#..#..#...#....#...#",
            "..#....#....##......##.....#.#.",
            "#...##..##......#...#....#.....",
            "....#.#.#.....###....##.##....#",
            "..........##...##.......#......",
            "..#.......#...##.#....##.##....",
            "....#........................#.",
            "...#...#.#.##...#.....#...#..#.",
            ".#....##..#..#..........##..##.",
            ".#.....#..#...#.##.....#.......",
            ".#.##...#.#..#.....##....#...#.",
            ".##...#........##....#..#......",
            ".....#........#..........#.#..#",
            "....#..##.......#..#.....#.....",
            "...........#...#........#.##..#",
            ".....#..#....#..#.#.....#....##",
            ".....#....#.##.#..##...........",
            "...##.......##.........#.......",
            "...............##..#....#.#....",
            ".......###..#........#..####.##",
            ".......#.##...#.#....#.####....",
            "....#...............#..........",
            "##.#.......#.....#......#...#..",
            "......##.....#....#.....#..#..#",
            ".....#...##.............#......",
            "#.#.##.#.....#..#........#.....",
            "......##....#..#........#......",
            "............#........#..#.#....",
            "##.......#......#...####..#.##.",
            "..##..#...#.............#.##...",
            ".....#..##......#.##......###..",
            "............#........#........#",
            "#.#.#.#...#.#.....#.........#..",
            ".........#...............#.....",
            ".............###.#.......#....#",
            "###.##..#..#..........#....#...",
            "#......#...#..#..#.....#.##....",
            "............#....#....#..#.....",
            "..#.#....#...#......#.#..#..##.",
            "...#........................#..",
            "#.#...#..........#......#.#....",
            ".........#................#...#",
            "##.....#....#........##.......#",
            "#...##........#...#...........#",
            "...#...#..........##.......#.#.",
            "..#.#.#....#......##...........",
            "...#.#...#.##.#..#.#.##........",
            "#....##.....###..#.......#.....",
            "###.....#.#.#...#..#.........##",
            "..#......#..###...#.#.#.....#.#",
            ".#....#.....#............#..##.",
            "....#....##..........#.....##..",
            "#...........#....#...#..#...##.",
            "..#.......#.....#..........#...",
            ".#..#................#......#..",
            "..#......#.#...#..#.#....#....#",
            "...#..#...###..#..##....#.#....",
            "..#..............#.....#.......",
            "...#.#...#.........#.#.........",
            "##......##...........##.#.##..#",
            "..#..##..#....#.#......#.#...##",
            "...#.###....###...#.....#......",
            "#.#................#......#....",
            "..#.....#.....#....##.......#..",
            ".#.#...............##..#.......",
            "...#....#.......#.#.....##..#..",
            ".........#....#.......#.#...##.",
            "#....#......##.#.........##...#",
            "#.............#..##.#.#..##....",
            "...#....#..#...#....#.#.#.#...#",
            ".#....#....#..##.....#.#...###.",
            "##............#.#...##.#..#.#..",
            "##.#....##.....#..#..###....#..",
            "##....#................##......",
            "...##..#...#..###....#.....##..",
            ".#...##......#..#.#.....#...#..",
            "..##......##...#.##.......#....",
            "......#.....#.....##........#.#",
            "##....#...........#............",
            "#.......#....#..#.##..##.#..#..",
            ".#....##.#.....#..#..#.........",
            ".#....#.#.#...#.....##.....#.#.",
            ".......##.#.#........#......##.",
            "##........#.##.......#...#..#..",
            "...###..##....#.#....#.#.......",
            "......#.......#...##.....#...#.",
            "..#......##.#......#.....#.....",
            ".....#.....###...#.............",
            "#...#.#...#...#..#......#......",
            "#.....#.......###.#....###.#...",
            "...#.......#....####....##..#..",
            "#.#.....#....#........#.......#",
            ".........#.......#......#.#...#",
            "..##....#.....##...............",
            "..........#..#.#..#......#.....",
            "..................##...##.#....",
            "........#.......#...#..#.#.#...",
            ".....#.#..##..#..#.#..#.......#",
            ".....#........#..#..#....#....#",
            "##............#..#..#...#....#.",
            ".....#....................##..#",
            "........##.#....###............",
            "##.......#.##................#.",
            ".....###.#..#..#...#....###.##.",
            ".#......#.#....#.....##.#......",
            "...##......##.........#...#....",
            "....####..............#........",
            "#...#.#..##..##.........##.....",
            "......#......#....#..#.........",
            "#.....#.....#.##...............",
            "..#.##..#...##.#.####..#....###",
            "#..#......#....#.##..##...#.#..",
            "#....#.......#.....#.....#.#...",
            "##.......#.....##...#.....#....",
            "...#...##..........#..##..##..#",
            ".###..#..##...#....#...#..#....",
            "......##..###.......###...#....",
            "....#...#.#.......#.##...##..##",
            "#.#......#..##.#.#..#..#..#....",
            "......#........#.......#.......",
            "..........#.#.....##...........",
            "......#..#........#..#.#..###..",
            "##..#.............##..#........",
            ".........#....#.....#.........#",
            ".....#..##...#..#..##.##......#",
            "###..#...........#.......#....#",
            "...............#....#.#........",
            ".##.#...#.#........##....#.....",
            ".##.###...##..###....#...#...#.",
            ".##..#....#.#.#...#.#.#.#...#..",
            ".###.#...#.......#....#..#.....",
            "..#..#.#.#.#........#.....##...",
            ".#.......#.#...#.#...........##",
            "...#.....##....#.....##...#....",
            "................#.....####...#.",
            ".#.#......#.......##...#.##....",
            ".###.........#.#......#..#.#...",
            "#......#...#....#..##.......#..",
            ".##..#....#..#...........#...#.",
            ".#...#.......##........#.##....",
            "..#...........#...##...........",
            ".....##....##......#....#..#...",
            "#......#.#...#.##.#...##....#..",
            "#....................#...##...#",
            "..#............#........#......",
            ".............#.........##.....#",
            "...#...#......##.#...#...#.#...",
            "..#...#.#.................#....",
            "....##...#....#...###.##......#",
            "...#....#...#..#...#....#.....#",
            "...##.#........#..#.........#..",
            "..##.....#..##...#.....##...#..",
            "#.........#.#.#...#......#...#.",
            "#.#...........#...#..#..#..##..",
            "..#..#..##....#..........#.###.",
            ".....#..#....#.#...#...#..#..#.",
            "###.....#..#.................#.",
            ".#..##.##.#......#....##..#...."
        )
    }
}