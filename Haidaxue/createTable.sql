use aaa;
CREATE TABLE h_question(
  question_sn VARCHAR(15) PRIMARY KEY ,
  question_lable VARCHAR(30),
  haidaxue_sn VARCHAR(15),
  question_content VARCHAR(300),
  question_anonymity BOOLEAN,
  question_bonus BOOLEAN,
  question_date DATE
);
CREATE TABLE h_answers(
  question_sn VARCHAR(15),
  answers_sn VARCHAR(15)PRIMARY KEY ,
  haidaxue_sn VARCHAR(15),
  answers_content VARCHAR(300),
  answers_anonymity BOOLEAN,
  answers_support_count INT(4),
  answers_comment_count INT(4),
  answers_date DATE
);
CREATE TABLE h_comments(
  comment_sn VARCHAR(15)PRIMARY KEY,
  answers_sn VARCHAR(15),
  haidaxue_sn VARCHAR(15),
  comment_content VARCHAR(300),
  comment_date DATE
);
CREATE TABLE h_collections(
  question_sn VARCHAR(15),
  haidaxue_sn VARCHAR(15)PRIMARY KEY
);
CREATE TABLE h_preferences(
  answers_sn VARCHAR(15),
  haidaxue_sn VARCHAR(15)PRIMARY KEY
);