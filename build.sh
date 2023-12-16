#!/bin/sh
set -x

cwd=$(pwd | sed 's/^.*\///')

gradle clean
gradle compileProductionExecutableKotlinJs
pnpm wrangler deploy build/js/packages/$cwd/kotlin/$cwd.js
