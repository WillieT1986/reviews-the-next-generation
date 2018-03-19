//Add Tag
const addTag = document.querySelector('.add-tag')

addTag.addEventListener('click', function() {
	const addTagInput = document.querySelector('addTag')
	const addTag = addTagInput.value

	if (addTag) {
		addTagInput.value = ''

		const addRequestUrl = 'http://localhost:8080/review/' + 
	}


})