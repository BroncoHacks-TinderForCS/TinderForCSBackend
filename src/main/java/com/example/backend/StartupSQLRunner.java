package com.example.backend;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class StartupSQLRunner {

    private final JdbcTemplate jdbcTemplate;

    public StartupSQLRunner(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void runSQLQueries() {
        jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (1, 'Alex Jones', 18, 'Male', 'Graduate', 'MIT', 'Mobile Apps excites me the most right now, and I''m building something that incorporates AI.', 157, 'Asian', 'Hindu', '1. Circles - Post Malone\n2. Daylight - David Kushner\n3. Numb - Linkin Park', 'Ranking: 23792\nProblems Solved: 358\nStreak: 160 days\nLink: https://leetcode.com/alex32', 'Dating & Friends', 'https://randomuser.me/api/portraits/men/42.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (1, 'Startups');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (1, 'Dating');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (1, 'Friends');
""");

jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (2, 'Brian Smith', 26, 'Male', 'Graduate', 'Georgia Tech', 'My focus is currently on Data Science, but I''m also learning a lot about Robotics on the side.', 183, 'Middle Eastern', 'Jewish', '1. Blinding Lights - The Weeknd\n2. Bohemian Rhapsody - Queen\n3. Sunflower - Post Malone', NULL, 'Dating', 'https://randomuser.me/api/portraits/men/72.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (2, 'Cloud Computing');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (2, 'UI/UX');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (2, 'Cybersecurity');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (2, 'Dating');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (3, 'Daniel Smith', 18, 'Male', 'Graduate', 'Stanford', 'I''m passionate about Hackathons and recently started exploring Robotics through personal projects.', 178, 'Black', 'Muslim', '1. Industry Baby - Lil Nas X\n2. Lose Yourself - Eminem\n3. Sunflower - Post Malone', 'Ranking: 49643\nProblems Solved: 405\nStreak: 237 days\nLink: https://leetcode.com/daniel46', 'Looking for Friends', 'https://randomuser.me/api/portraits/men/68.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (3, 'Hackathons');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (3, 'Cybersecurity');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (3, 'Friends');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (4, 'Alex Jones', 24, 'Male', 'Freshman', 'Harvard', 'My academic interests include Data Science, and I''ve been working on a side project using Hackathons.', 156, 'Asian', 'Jewish', '1. Paint It Black - The Rolling Stones\n2. Stay - The Kid LAROI & Justin Bieber\n3. Sunflower - Post Malone', 'Ranking: 83234\nProblems Solved: 288\nStreak: 148 days\nLink: N/A', 'Dating & Friends', 'https://randomuser.me/api/portraits/men/14.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (4, 'Gaming');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (4, 'AI');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (4, 'Hackathons');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (4, 'Dating');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (4, 'Friends');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (5, 'Daniel Williams', 26, 'Male', 'Freshman', 'Harvard', 'I''m passionate about Cloud Computing and recently started exploring UI/UX through personal projects.', 178, 'Middle Eastern', NULL, '1. Heat Waves - Glass Animals\n2. Levitating - Dua Lipa\n3. Lose Yourself - Eminem', NULL, 'Dating & Friends', 'https://randomuser.me/api/portraits/men/33.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (5, 'Startups');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (5, 'Cybersecurity');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (5, 'UI/UX');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (5, 'Friends');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (5, 'Dating');
""");



jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (6, 'Daniel Jones', 21, 'Male', 'Senior', 'UC Berkeley', 'Currently exploring how Hackathons and Robotics can intersect in real-world applications.', 166, 'Asian', 'Christian', '1. 505 - Arctic Monkeys\n2. Daylight - David Kushner\n3. Levitating - Dua Lipa', 'Ranking: 5681\nProblems Solved: 463\nStreak: 304 days\nLink: https://leetcode.com/daniel85', 'Dating', 'https://randomuser.me/api/portraits/men/26.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (6, 'Cloud Computing');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (6, 'Dating');
""");



jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (7, 'Chris Jones', 28, 'Male', 'Senior', 'Carnegie Mellon', 'I''m deeply interested in Data Science and would love to team up on something with Startups.', 173, 'Asian', 'Jewish', '1. Blinding Lights - The Weeknd\n2. Sunflower - Post Malone\n3. good 4 u - Olivia Rodrigo', 'Ranking: 68482\nProblems Solved: 250\nStreak: 36 days\nLink: N/A', 'Dating & Friends', 'https://randomuser.me/api/portraits/men/29.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (7, 'Cloud Computing');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (7, 'Web Development');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (7, 'Friends');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (7, 'Dating');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (8, 'Chris Smith', 27, 'Male', 'Senior', 'Carnegie Mellon', 'My focus is currently on AI, but I''m also learning a lot about Hackathons on the side.', 166, 'White', NULL, '1. Bohemian Rhapsody - Queen\n2. The Less I Know The Better - Tame Impala\n3. good 4 u - Olivia Rodrigo', 'Ranking: 42391\nProblems Solved: 57\nStreak: 113 days\nLink: N/A', 'Dating & Friends', 'https://randomuser.me/api/portraits/men/73.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (8, 'AI');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (8, 'Robotics');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (8, 'Friends');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (8, 'Dating');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (9, 'Alex Jones', 22, 'Male', 'Sophomore', 'Georgia Tech', 'Trying to balance my interest in Web Development with my growing skills in Mobile Apps.', 157, NULL, 'Atheist', '1. Lose Yourself - Eminem\n2. Numb - Linkin Park\n3. The Less I Know The Better - Tame Impala', 'Ranking: 66391\nProblems Solved: 353\nStreak: 26 days\nLink: https://leetcode.com/alex67', 'Dating', 'https://randomuser.me/api/portraits/men/40.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (9, 'Cloud Computing');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (9, 'Dating');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (10, 'Ethan Johnson', 19, 'Male', 'Junior', 'Carnegie Mellon', 'I''m passionate about Machine Learning and recently started exploring AI through personal projects.', 152, NULL, NULL, '1. Bohemian Rhapsody - Queen\n2. Stay - The Kid LAROI & Justin Bieber\n3. Take On Me - a-ha', 'Ranking: 81087\nProblems Solved: 406\nStreak: 161 days\nLink: N/A', 'Looking for Friends', 'https://randomuser.me/api/portraits/men/89.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (10, 'Startups');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (10, 'Web Development');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (10, 'Hackathons');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (10, 'Friends');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (11, 'Brian Williams', 22, 'Male', 'Freshman', 'Carnegie Mellon', 'Trying to balance my interest in Machine Learning with my growing skills in Data Science.', 158, 'Asian', 'Muslim', '1. Daylight - David Kushner\n2. Industry Baby - Lil Nas X\n3. Stay - The Kid LAROI & Justin Bieber', 'Ranking: 97815\nProblems Solved: 422\nStreak: 38 days\nLink: N/A', 'Looking for Friends', 'https://randomuser.me/api/portraits/men/23.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (11, 'Cloud Computing');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (11, 'UI/UX');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (11, 'Hackathons');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (11, 'Friends');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (12, 'Alex Jones', 18, 'Male', 'Sophomore', 'UC Berkeley', 'Lately, I''ve been diving into Robotics while still keeping my curiosity alive in Cybersecurity.', 153, 'Asian', 'Muslim', '1. Daylight - David Kushner\n2. Numb - Linkin Park\n3. good 4 u - Olivia Rodrigo', 'Ranking: 14276\nProblems Solved: 499\nStreak: 120 days\nLink: https://leetcode.com/alex11', 'Looking for Friends', 'https://randomuser.me/api/portraits/men/43.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (12, 'UI/UX');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (12, 'Friends');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (13, 'Chris Johnson', 18, 'Male', 'Freshman', 'UC Berkeley', 'My focus is currently on AI, but I''m also learning a lot about Mobile Apps on the side.', 173, 'Middle Eastern', 'Hindu', '1. Die For You - The Weeknd\n2. Levitating - Dua Lipa\n3. Stay - The Kid LAROI & Justin Bieber', NULL, 'Dating', 'https://randomuser.me/api/portraits/men/76.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (13, 'Gaming');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (13, 'Dating');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (14, 'Ethan Williams', 25, 'Male', 'Junior', 'UC Berkeley', 'Web Development excites me the most right now, and I''m building something that incorporates Data Science.', 170, NULL, NULL, '1. Circles - Post Malone\n2. Lose Yourself - Eminem\n3. Paint It Black - The Rolling Stones', 'Ranking: 2093\nProblems Solved: 276\nStreak: 179 days\nLink: https://leetcode.com/ethan72', 'Dating & Friends', 'https://randomuser.me/api/portraits/men/68.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (14, 'Cybersecurity');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (14, 'Hackathons');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (14, 'Dating');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (14, 'Friends');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (15, 'Ethan Brown', 22, 'Male', 'Senior', 'Carnegie Mellon', 'After taking a course on Web Development, I''ve found myself drawn to projects involving Startups.', 183, 'Asian', NULL, '1. Levitating - Dua Lipa\n2. Stay - The Kid LAROI & Justin Bieber\n3. Sunflower - Post Malone', NULL, 'Dating', 'https://randomuser.me/api/portraits/men/39.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (15, 'UI/UX');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (15, 'Hackathons');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (15, 'Dating');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (16, 'Daniel Jones', 28, 'Male', 'Senior', 'Carnegie Mellon', 'I''m deeply interested in Startups and would love to team up on something with Web Development.', 175, 'Asian', 'Jewish', '1. Blinding Lights - The Weeknd\n2. Take On Me - a-ha\n3. good 4 u - Olivia Rodrigo', 'Ranking: 56947\nProblems Solved: 442\nStreak: 205 days\nLink: https://leetcode.com/daniel77', 'Dating', 'https://randomuser.me/api/portraits/men/21.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (16, 'Robotics');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (16, 'AI');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (16, 'Cloud Computing');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (16, 'Dating');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (17, 'Daniel Johnson', 22, 'Male', 'Junior', 'UC Berkeley', 'Lately, I''ve been diving into Web Development while still keeping my curiosity alive in Hackathons.', 162, NULL, NULL, '1. 505 - Arctic Monkeys\n2. Paint It Black - The Rolling Stones\n3. good 4 u - Olivia Rodrigo', 'Ranking: 24600\nProblems Solved: 100\nStreak: 332 days\nLink: https://leetcode.com/daniel22', 'Dating', 'https://randomuser.me/api/portraits/men/8.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (17, 'Cloud Computing');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (17, 'Dating');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (18, 'Brian Smith', 19, 'Male', 'Freshman', 'Carnegie Mellon', 'My academic interests include Hackathons, and I''ve been working on a side project using Robotics.', 160, 'Black', 'Hindu', '1. Heat Waves - Glass Animals\n2. Paint It Black - The Rolling Stones\n3. Take On Me - a-ha', NULL, 'Dating', 'https://randomuser.me/api/portraits/men/62.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (18, 'Web Development');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (18, 'Dating');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (19, 'Ethan Smith', 18, 'Male', 'Graduate', 'MIT', 'After taking a course on Startups, I''ve found myself drawn to projects involving Robotics.', 174, 'Asian', NULL, '1. Die For You - The Weeknd\n2. Numb - Linkin Park\n3. Take On Me - a-ha', 'Ranking: 64788\nProblems Solved: 97\nStreak: 239 days\nLink: N/A', 'Dating', 'https://randomuser.me/api/portraits/men/35.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (19, 'Data Science');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (19, 'Cloud Computing');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (19, 'Dating');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (20, 'Ethan Williams', 25, 'Male', 'Freshman', 'Georgia Tech', 'After taking a course on Cybersecurity, I''ve found myself drawn to projects involving AI.', 156, 'Latino', 'Muslim', '1. Circles - Post Malone\n2. Daylight - David Kushner\n3. The Less I Know The Better - Tame Impala', 'Ranking: 48090\nProblems Solved: 140\nStreak: 33 days\nLink: https://leetcode.com/ethan93', 'Looking for Friends', 'https://randomuser.me/api/portraits/men/12.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (20, 'Hackathons');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (20, 'Web Development');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (20, 'Friends');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (21, 'Daniel Jones', 18, 'Male', 'Sophomore', 'Stanford', 'My academic interests include AI, and I''ve been working on a side project using UI/UX.', 161, NULL, NULL, '1. Creep - Radiohead\n2. Daylight - David Kushner\n3. Numb - Linkin Park', NULL, 'Dating & Friends', 'https://randomuser.me/api/portraits/men/79.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (21, 'Cybersecurity');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (21, 'Web Development');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (21, 'Friends');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (21, 'Dating');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (22, 'Daniel Johnson', 24, 'Male', 'Junior', 'UC Berkeley', 'After taking a course on Robotics, I''ve found myself drawn to projects involving Cloud Computing.', 178, 'Asian', 'Christian', '1. Bohemian Rhapsody - Queen\n2. Daylight - David Kushner\n3. Take On Me - a-ha', NULL, 'Looking for Friends', 'https://randomuser.me/api/portraits/men/53.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (22, 'AI');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (22, 'Friends');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (23, 'Daniel Jones', 21, 'Male', 'Senior', 'Carnegie Mellon', 'I''m passionate about UI/UX and recently started exploring Robotics through personal projects.', 176, 'Black', 'Muslim', '1. Bohemian Rhapsody - Queen\n2. Daylight - David Kushner\n3. Stay - The Kid LAROI & Justin Bieber', 'Ranking: 71507\nProblems Solved: 400\nStreak: 252 days\nLink: https://leetcode.com/daniel15', 'Looking for Friends', 'https://randomuser.me/api/portraits/men/20.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (23, 'Gaming');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (23, 'Friends');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (24, 'Ethan Smith', 23, 'Male', 'Senior', 'MIT', 'I enjoy collaborating on anything involving Web Development and want to improve in Machine Learning.', 172, NULL, NULL, '1. Heat Waves - Glass Animals\n2. Numb - Linkin Park\n3. Take On Me - a-ha', 'Ranking: 84176\nProblems Solved: 161\nStreak: 79 days\nLink: https://leetcode.com/ethan56', 'Dating & Friends', 'https://randomuser.me/api/portraits/men/9.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (24, 'Mobile Apps');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (24, 'UI/UX');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (24, 'Friends');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (24, 'Dating');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (25, 'Ethan Jones', 19, 'Male', 'Graduate', 'MIT', 'I''m deeply interested in Gaming and would love to team up on something with Web Development.', 165, 'Asian', NULL, '1. Bad Habit - Steve Lacy\n2. Creep - Radiohead\n3. Industry Baby - Lil Nas X', 'Ranking: 30853\nProblems Solved: 274\nStreak: 203 days\nLink: N/A', 'Dating & Friends', 'https://randomuser.me/api/portraits/men/65.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (25, 'Cybersecurity');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (25, 'Machine Learning');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (25, 'Data Science');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (25, 'Friends');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (25, 'Dating');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (26, 'Diana Williams', 24, 'Female', 'Sophomore', 'Carnegie Mellon', 'I''m deeply interested in Cloud Computing and would love to team up on something with Web Development.', 189, 'White', 'Atheist', '1. Stay - The Kid LAROI & Justin Bieber\n2. Sunflower - Post Malone\n3. good 4 u - Olivia Rodrigo', 'Ranking: 48540\nProblems Solved: 319\nStreak: 91 days\nLink: https://leetcode.com/diana86', 'Dating & Friends', 'https://randomuser.me/api/portraits/women/41.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (26, 'Cybersecurity');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (26, 'Dating');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (26, 'Friends');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (27, 'Beth Williams', 26, 'Female', 'Graduate', 'Carnegie Mellon', 'After taking a course on Web Development, I''ve found myself drawn to projects involving UI/UX.', 153, 'White', NULL, '1. Creep - Radiohead\n2. The Less I Know The Better - Tame Impala\n3. good 4 u - Olivia Rodrigo', 'Ranking: 94223\nProblems Solved: 102\nStreak: 189 days\nLink: https://leetcode.com/beth77', 'Looking for Friends', 'https://randomuser.me/api/portraits/women/66.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (27, 'Hackathons');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (27, 'Robotics');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (27, 'Friends');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (28, 'Diana Brown', 18, 'Female', 'Freshman', 'Stanford', 'I enjoy collaborating on anything involving Cybersecurity and want to improve in AI.', 156, 'White', NULL, '1. Creep - Radiohead\n2. Paint It Black - The Rolling Stones\n3. Stay - The Kid LAROI & Justin Bieber', 'Ranking: 67594\nProblems Solved: 189\nStreak: 235 days\nLink: N/A', 'Dating & Friends', 'https://randomuser.me/api/portraits/women/52.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (28, 'Mobile Apps');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (28, 'AI');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (28, 'Dating');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (28, 'Friends');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (29, 'Beth Williams', 27, 'Female', 'Senior', 'MIT', 'After taking a course on Data Science, I''ve found myself drawn to projects involving Cybersecurity.', 181, NULL, 'Atheist', '1. Blinding Lights - The Weeknd\n2. Industry Baby - Lil Nas X\n3. The Less I Know The Better - Tame Impala', 'Ranking: 74606\nProblems Solved: 128\nStreak: 140 days\nLink: https://leetcode.com/beth34', 'Looking for Friends', 'https://randomuser.me/api/portraits/women/6.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (29, 'Machine Learning');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (29, 'Cybersecurity');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (29, 'Friends');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (30, 'Alice Williams', 26, 'Female', 'Junior', 'Harvard', 'My focus is currently on AI, but I''m also learning a lot about Web Development on the side.', 153, 'Black', 'Atheist', '1. Bohemian Rhapsody - Queen\n2. Numb - Linkin Park\n3. Paint It Black - The Rolling Stones', 'Ranking: 18541\nProblems Solved: 456\nStreak: 365 days\nLink: https://leetcode.com/alice29', 'Dating', 'https://randomuser.me/api/portraits/women/73.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (30, 'Hackathons');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (30, 'Dating');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (31, 'Clara Smith', 22, 'Female', 'Freshman', 'MIT', 'My focus is currently on Mobile Apps, but I''m also learning a lot about Cloud Computing on the side.', 156, 'Black', NULL, '1. Bad Habit - Steve Lacy\n2. Creep - Radiohead\n3. Levitating - Dua Lipa', 'Ranking: 55767\nProblems Solved: 383\nStreak: 78 days\nLink: https://leetcode.com/clara61', 'Looking for Friends', 'https://randomuser.me/api/portraits/women/40.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (31, 'UI/UX');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (31, 'Hackathons');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (31, 'Cloud Computing');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (31, 'Friends');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (32, 'Alice Smith', 22, 'Female', 'Freshman', 'MIT', 'After taking a course on Mobile Apps, I''ve found myself drawn to projects involving Cloud Computing.', 187, 'Middle Eastern', 'Atheist', '1. Bad Habit - Steve Lacy\n2. Heat Waves - Glass Animals\n3. Numb - Linkin Park', 'Ranking: 32701\nProblems Solved: 266\nStreak: 310 days\nLink: https://leetcode.com/alice25', 'Dating & Friends', 'https://randomuser.me/api/portraits/women/36.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (32, 'Web Development');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (32, 'Friends');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (32, 'Dating');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (33, 'Clara Johnson', 22, 'Female', 'Freshman', 'Carnegie Mellon', 'Trying to balance my interest in UI/UX with my growing skills in Cloud Computing.', 188, NULL, NULL, '1. Die For You - The Weeknd\n2. Industry Baby - Lil Nas X\n3. The Less I Know The Better - Tame Impala', NULL, 'Looking for Friends', 'https://randomuser.me/api/portraits/women/25.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (33, 'Cloud Computing');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (33, 'Friends');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (34, 'Alice Brown', 27, 'Female', 'Graduate', 'Harvard', 'I''m passionate about Startups and recently started exploring Data Science through personal projects.', 180, 'Black', 'Jewish', '1. Circles - Post Malone\n2. Lose Yourself - Eminem\n3. Sunflower - Post Malone', NULL, 'Dating & Friends', 'https://randomuser.me/api/portraits/women/6.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (34, 'Mobile Apps');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (34, 'Dating');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (34, 'Friends');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (35, 'Alice Brown', 22, 'Female', 'Senior', 'UC Berkeley', 'Currently exploring how Data Science and Robotics can intersect in real-world applications.', 190, NULL, 'Christian', '1. Blinding Lights - The Weeknd\n2. Bohemian Rhapsody - Queen\n3. Heat Waves - Glass Animals', 'Ranking: 22938\nProblems Solved: 120\nStreak: 117 days\nLink: https://leetcode.com/alice64', 'Dating & Friends', 'https://randomuser.me/api/portraits/women/73.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (35, 'Startups');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (35, 'Machine Learning');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (35, 'Dating');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (35, 'Friends');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (36, 'Alice Smith', 20, 'Female', 'Senior', 'Carnegie Mellon', 'My focus is currently on AI, but I''m also learning a lot about Machine Learning on the side.', 165, 'Black', NULL, '1. Bad Habit - Steve Lacy\n2. Industry Baby - Lil Nas X\n3. Levitating - Dua Lipa', 'Ranking: 52088\nProblems Solved: 208\nStreak: 285 days\nLink: N/A', 'Dating & Friends', 'https://randomuser.me/api/portraits/women/7.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (36, 'Mobile Apps');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (36, 'Friends');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (36, 'Dating');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (37, 'Ella Smith', 27, 'Female', 'Graduate', 'Stanford', 'Gaming excites me the most right now, and I''m building something that incorporates Cybersecurity.', 165, NULL, NULL, '1. Blinding Lights - The Weeknd\n2. Paint It Black - The Rolling Stones\n3. The Less I Know The Better - Tame Impala', 'Ranking: 32050\nProblems Solved: 466\nStreak: 48 days\nLink: https://leetcode.com/ella37', 'Dating', 'https://randomuser.me/api/portraits/women/23.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (37, 'Startups');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (37, 'Dating');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (38, 'Beth Smith', 25, 'Female', 'Sophomore', 'Georgia Tech', 'My focus is currently on Gaming, but I''m also learning a lot about Data Science on the side.', 154, 'White', NULL, '1. 505 - Arctic Monkeys\n2. Daylight - David Kushner\n3. Die For You - The Weeknd', NULL, 'Dating', 'https://randomuser.me/api/portraits/women/15.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (38, 'Machine Learning');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (38, 'Dating');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (39, 'Clara Jones', 19, 'Female', 'Freshman', 'Stanford', 'My focus is currently on Data Science, but I''m also learning a lot about Startups on the side.', 171, 'White', NULL, '1. Levitating - Dua Lipa\n2. Numb - Linkin Park\n3. Take On Me - a-ha', 'Ranking: 41715\nProblems Solved: 315\nStreak: 67 days\nLink: https://leetcode.com/clara46', 'Dating', 'https://randomuser.me/api/portraits/women/24.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (39, 'Cybersecurity');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (39, 'UI/UX');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (39, 'Startups');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (39, 'Dating');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (40, 'Alice Johnson', 28, 'Female', 'Junior', 'UC Berkeley', 'I''m passionate about Cloud Computing and recently started exploring Machine Learning through personal projects.', 187, 'Asian', 'Atheist', '1. Die For You - The Weeknd\n2. Levitating - Dua Lipa\n3. good 4 u - Olivia Rodrigo', NULL, 'Dating', 'https://randomuser.me/api/portraits/women/52.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (40, 'Machine Learning');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (40, 'Hackathons');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (40, 'AI');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (40, 'Dating');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (41, 'Diana Smith', 25, 'Female', 'Junior', 'Carnegie Mellon', 'My academic interests include Robotics, and I''ve been working on a side project using Mobile Apps.', 174, 'Middle Eastern', NULL, '1. 505 - Arctic Monkeys\n2. Blinding Lights - The Weeknd\n3. Bohemian Rhapsody - Queen', 'Ranking: 25071\nProblems Solved: 397\nStreak: 15 days\nLink: https://leetcode.com/diana98', 'Dating', 'https://randomuser.me/api/portraits/women/17.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (41, 'Machine Learning');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (41, 'Dating');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (42, 'Alice Williams', 19, 'Female', 'Senior', 'Stanford', 'My focus is currently on Mobile Apps, but I''m also learning a lot about Gaming on the side.', 155, 'Latino', NULL, '1. Bad Habit - Steve Lacy\n2. Bohemian Rhapsody - Queen\n3. Creep - Radiohead', 'Ranking: 25229\nProblems Solved: 258\nStreak: 199 days\nLink: https://leetcode.com/alice2', 'Dating & Friends', 'https://randomuser.me/api/portraits/women/7.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (42, 'Gaming');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (42, 'Robotics');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (42, 'Cloud Computing');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (42, 'Dating');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (42, 'Friends');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (43, 'Clara Smith', 20, 'Female', 'Junior', 'MIT', 'Lately, I''ve been diving into Robotics while still keeping my curiosity alive in Startups.', 151, NULL, 'Christian', '1. Levitating - Dua Lipa\n2. Numb - Linkin Park\n3. Sunflower - Post Malone', 'Ranking: 33298\nProblems Solved: 255\nStreak: 268 days\nLink: https://leetcode.com/clara45', 'Dating & Friends', 'https://randomuser.me/api/portraits/women/41.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (43, 'Web Development');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (43, 'Cloud Computing');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (43, 'UI/UX');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (43, 'Friends');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (43, 'Dating');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (44, 'Beth Jones', 27, 'Female', 'Sophomore', 'Harvard', 'My focus is currently on Hackathons, but I''m also learning a lot about Gaming on the side.', 152, 'Middle Eastern', NULL, '1. Bad Habit - Steve Lacy\n2. Circles - Post Malone\n3. Levitating - Dua Lipa', 'Ranking: 72417\nProblems Solved: 355\nStreak: 210 days\nLink: https://leetcode.com/beth73', 'Looking for Friends', 'https://randomuser.me/api/portraits/women/24.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (44, 'Machine Learning');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (44, 'Friends');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (45, 'Ella Brown', 25, 'Female', 'Senior', 'Stanford', 'Currently exploring how AI and Data Science can intersect in real-world applications.', 174, 'Asian', 'Muslim', '1. Lose Yourself - Eminem\n2. Numb - Linkin Park\n3. Paint It Black - The Rolling Stones', NULL, 'Dating', 'https://randomuser.me/api/portraits/women/66.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (45, 'Gaming');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (45, 'Dating');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (46, 'Diana Johnson', 27, 'Female', 'Graduate', 'Stanford', 'My academic interests include Hackathons, and I''ve been working on a side project using Startups.', 150, NULL, 'Jewish', '1. Daylight - David Kushner\n2. Levitating - Dua Lipa\n3. Numb - Linkin Park', NULL, 'Looking for Friends', 'https://randomuser.me/api/portraits/women/82.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (46, 'UI/UX');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (46, 'Gaming');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (46, 'Friends');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (47, 'Diana Jones', 25, 'Female', 'Sophomore', 'UC Berkeley', 'Currently exploring how Gaming and Data Science can intersect in real-world applications.', 178, 'Black', 'Hindu', '1. Bad Habit - Steve Lacy\n2. Numb - Linkin Park\n3. The Less I Know The Better - Tame Impala', 'Ranking: 36803\nProblems Solved: 94\nStreak: 343 days\nLink: https://leetcode.com/diana87', 'Dating', 'https://randomuser.me/api/portraits/women/13.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (47, 'Cloud Computing');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (47, 'Dating');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (48, 'Ella Brown', 27, 'Female', 'Graduate', 'Stanford', 'Trying to balance my interest in Robotics with my growing skills in UI/UX.', 166, 'Middle Eastern', NULL, '1. Bad Habit - Steve Lacy\n2. Paint It Black - The Rolling Stones\n3. Stay - The Kid LAROI & Justin Bieber', NULL, 'Dating & Friends', 'https://randomuser.me/api/portraits/women/6.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (48, 'Mobile Apps');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (48, 'Startups');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (48, 'Data Science');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (48, 'Friends');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (48, 'Dating');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (49, 'Clara Brown', 26, 'Female', 'Senior', 'Carnegie Mellon', 'Lately, I''ve been diving into AI while still keeping my curiosity alive in Gaming.', 183, NULL, 'Christian', '1. Industry Baby - Lil Nas X\n2. Lose Yourself - Eminem\n3. Take On Me - a-ha', 'Ranking: 66598\nProblems Solved: 497\nStreak: 208 days\nLink: https://leetcode.com/clara61', 'Dating & Friends', 'https://randomuser.me/api/portraits/women/36.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (49, 'AI');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (49, 'Data Science');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (49, 'Friends');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (49, 'Dating');
""");


jdbcTemplate.execute("""
INSERT INTO user (id, name, age, gender, grade_level, college, description, height, race, religion, spotify, leetcode, status, picture)
VALUES (50, 'Alice Brown', 18, 'Female', 'Junior', 'Stanford', 'My academic interests include Mobile Apps, and I''ve been working on a side project using Web Development.', 190, NULL, NULL, '1. 505 - Arctic Monkeys\n2. Lose Yourself - Eminem\n3. Numb - Linkin Park', NULL, 'Dating', 'https://randomuser.me/api/portraits/women/39.jpg');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (50, 'Web Development');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (50, 'Hackathons');
""");

jdbcTemplate.execute("""
INSERT INTO user_interests (user_id, interests) VALUES (50, 'Robotics');
""");

jdbcTemplate.execute("""
INSERT INTO user_categories (user_id, categories) VALUES (50, 'Dating');
""");
    }

}