var page = 0;
var isLoading = false;

$(window).scroll(function() {
    if (($(window).scrollTop() + $(window).height()) >= $(document).height() && !isLoading) {
        loadMorePosts();
    }
});

function loadMorePosts() {
    isLoading = true;
    $.ajax({
        url: "/posts",
        data: {
            page: page,
            size: 10
        },
        success: function(posts) {
            if (posts.length > 0) {
                posts.forEach(function(post) {
                    var postHtml = '<div class="card mb-3">' +
                        '<div class="card-body">' +
                        '<h5 class="card-title">' + post.title + '</h5>' +
                        '<p class="card-text">' + post.content + '</p>' +
                        '</div>' +
                        '</div>';
                    $('#posts-container').append(postHtml);
                });
                page++;
            } else {
                // No more posts to load
            }
            isLoading = false;
        }
    });
}