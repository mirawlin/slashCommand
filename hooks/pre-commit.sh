#!/bin/bash

set -e
set -o pipefail

echo "Running git pre-commit hook"

./gradlew ktlint
