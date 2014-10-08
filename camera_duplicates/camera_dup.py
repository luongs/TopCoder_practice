'''
Author: Sebastien Luong
Nimia programming question
'''
import re, time
from fuzzywuzzy import fuzz
from itertools import groupby
from operator import itemgetter

def checkRoman(item):
	II = "ii"
	III = "iii"
	IV = "iv"
	if (II in item) or (III in item) or (IV in item): 
		return True
	return False

def romanToInt(item):
	II = "ii"
	III = "iii"
	IV = "iv"
	if (III in item): 
		item = item.replace(III, "3")
	elif (II in item):
		item = item.replace(II, "2")
	elif (IV in item): 
		item = item.replace(IV, "4")
	return item

def convertCamString(camera):
	if (checkRoman(camera)):
		newCamStr = romanToInt(camera)
		newCamStr = newCamStr.lower()
		return newCamStr
	return camera



t0 = time.clock()

# Read file and remove duplicates
f = open('camera_list.txt', 'r')
new_f = open('no_dup.txt', 'w')
cam_dictionary = {}
for item in f:
	# store non duplicates in a dictionary
	if item not in cam_dictionary:
		cam_dictionary[item] = True

cam_list = []
for item in f: 
	cam_list.append(item)
# Remove duplicates 
cam_list = list(set(cam_list))
# Write non duplicates in another txt file 
# write it in a list to be sorted
# create set to remove duplicates in case changes
for item in cam_dictionary: 
	new_f.write(item)
	cam_list.append(item)
cam_list = list(set(cam_list))
new_f.close()
# Sort non duplicates alphabetically
# Brands of the same name will be in the vicinity of one another 
# Create default value list
brand_f = open('brand.txt', 'w')
cam_list = sorted(cam_list)
brand_list = []
#key_list = []
for item in cam_list:
	brand_f.write(item)
	brand_list.append(item)
	#key_list.append(item)
brand_f.close()

#Save letters and numbers into different lists
#This will reduce redundancy when checking for close duplicates
list_of_list = [] 
for letter, words in groupby(cam_list, key=itemgetter(0)):
	# reset letter list for next entry
	letter_list = []
	for word in words: 
		letter_list.append(word)
	list_of_list.append(letter_list)
key_f = open('key.txt', 'w')

list_of_set = []
for letter in list_of_list: 
	# iterate through each value in letter saving the high close matches
	closematch_list = []
	for outer_index in range(0, len(letter)):
		for inner_index in range(outer_index+1, len(letter)):
			if (not letter[outer_index]):
				continue
			# converting strings to make partial ratio matching more accurate 
			outer_cam = letter[outer_index]
			inner_cam = letter[inner_index]
			outer_cam = convertCamString(outer_cam)
			inner_cam = convertCamString(inner_cam)

			if (fuzz.partial_ratio(outer_cam, inner_cam)> 90):
				key_f.write(letter[inner_index])
				closematch_list.append(letter[inner_index])
				letter[outer_index] = ""
			#closematch_list = list(set(closematch_list))	
	list_of_set.append(closematch_list)

print time.clock() - t0