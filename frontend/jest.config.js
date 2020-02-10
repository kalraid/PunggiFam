module.exports = {
  preset: '@vue/cli-plugin-unit-jest',
  coverageDirectory: "<rootDir>/tests/unit/coverage",
  collectCoverageFrom: [
    "src/**/*.{js,vue}",
    "!src/main.js",
    "!src/router/index.js",
    "!**/node_modules/**"
  ]
};
