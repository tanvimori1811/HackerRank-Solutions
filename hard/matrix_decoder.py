import re

# Read matrix dimensions
rows, cols = map(int, input().split())

# Read the matrix rows
matrix = [input() for _ in range(rows)]

# Read columns top-down
decoded = ''.join(''.join(matrix[r][c] for r in range(rows)) for c in range(cols))

# Replace non-alphanumeric characters between alphanumeric with a space
decoded = re.sub(r'(?<=\w)[^\w]+(?=\w)', ' ', decoded)

print(decoded)
