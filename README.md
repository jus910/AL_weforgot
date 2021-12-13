# AL_weforgot
# Kevin Li, Justin Mohabir, Jonathan Song
## ALTester
## OrderedArrayList
* compare: takes an index and an integer. Returns true if the given integer is greater or equal to the element at index -1 of _data, 
  and less than or equal to the element at index. If compare is used on index 0, then it does not do a comparison with the element at index -1. 
* add: takes an input and iterates across all elements of _data. For each index, compare is used to check if placing the input at that index will 
  keep the ascending order. If compare returns true, then the input is inserted at index and _size increments. If compare returns false for all elements, 
  the input is added onto the end and _size increments
* toString: prints out elements of _data with a for loop
* size: returns _size
* get: takes an index and returns element of _data at the given index
* set: takes an index and an integer. Uses compare to check if changing the value at the given index to the given integer will ruin the ascending order. 
  If the order is not ruined, the value is changed, otherwise, an error is printed out
* remove: takes an index. Removes the value at the given index
