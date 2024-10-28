// tailwind.config.js
module.exports = {
  content: [
    "./src/main/resources/templates/**/*.html",
    "./src/main/resources/static/**/*.js", // 필요한 경우 JavaScript 파일 경로 추가
    "./src/main/resources/templates/*.html",  // templates 디렉터리의 모든 HTML 파일
  ],
  theme: {
    extend: {},
  },
  plugins: [],
};
