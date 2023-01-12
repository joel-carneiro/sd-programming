'''

# Transferindo lista para sets

users_data_science = [12, 24, 36, 48]
users_machine_learning = [36, 48, 60, 72]

watch = users_machine_learning.copy()
watch.extend(users_data_science)

print(set(watch))

'''

set()

positives = {0, 1, 2, 3, 4, 5, 6}
negatives = {0, -1, -2, -3, -4, -5, -6}

union = positives | negatives
intersection = positives & negatives
less = positives - negatives

print(union)
print(intersection)
print(less)