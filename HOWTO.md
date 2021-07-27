Welcome to the **LeetCode Solution Curation**! If you are new to open source contribution and/or if you need a refresher on Git and GitHub basics, here are some resources to help you out:

* [Hello World](https://guides.github.com/activities/hello-world/)
* [Step-by-step guide to contributing on GitHub](https://www.dataschool.io/how-to-contribute-on-github/)
* [Git and GitHub for Beginners - Crash Course](https://youtu.be/RGOj5yH7evk)
* [How to Fork and Clone a GitHub Repository](https://egghead.io/lessons/javascript-how-to-fork-and-clone-a-github-repository)
* [How to Contribute to Someone's GitHub Repository (Fork/Pull Request)](https://youtu.be/yr6IzOGoMsQ)

In case you don't want to go through the resources, here's a quick refresher:

* Get a copy of [leetcode-solution-curation](https://github.com/Tahanima/leetcode-solution-curation) by clicking the <kbd><b>Fork</b></kbd> button.

* Clone, i.e, download your copy of the repository to your local machine using
```bash
# Creates a folder named `leetcode-solution-curation` in the current directory with appropriate resources
$ git clone https://github.com/[your_username]/leetcode-solution-curation.git
```
* Move to the `leetcode-solution-curation` folder using
```bash
# Changes current directory to a folder named `leetcode-solution-curation`
$ cd leetcode-solution-curation
```

* Run the following command to see that your local copy has a reference to your forked remote repository in GitHub.
```bash
$ git remote -v
origin  https://github.com/[your_username]/leetcode-solution-curation.git (fetch)
origin  https://github.com/[your_username]/leetcode-solution-curation.git (push)
```
* Add a reference to the original [leetcode-solution-curation](https://github.com/Tahanima/leetcode-solution-curation) repository using

```bash
# Adds a new remote named `upstream`
$ git remote add upstream https://github.com/Tahanima/leetcode-solution-curation.git
```

* Keep your copy of the repository updated with the original repository. Before making any changes and/or in an appropriate interval, run the following commands to update your local repository.

```bash
# Switches to `main` branch
$ git checkout main

# Fetches the branches and their respective commits from the `upstream` repository
$ git fetch upstream

# Merges the changes from upstream/main into your local default branch
$ git merge upstream/main

# Pushes changes to your forked `leetcode-solution-curation` repo
$ git push origin main
```

* Run the following commands as needed while working. 

```bash
# Creates a new branch named `branch_name` and switches to it
$ git checkout -b branch_name

# Switches to an existing branch named `branch_name`
$ git checkout branch_name

# Adds a file with the path `path_to_file` respective to the root directory
$ git add path_to_file

# Associates the message 'relevant message' to the file you have changed
$ git commit -m 'relevant message'

# Pushes your changes to your remote repository
$ git push -u origin branch_name
```

To sumbit your pull request after pushing changes to a branch, go to the `leetcode-solution-curation` repository from your browser and click on `Compare & pull requests`. Add the necessary details and then, submit the pull request.

